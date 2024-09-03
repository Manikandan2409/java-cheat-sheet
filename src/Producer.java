
import java.util.HashMap;
import java.util.LinkedList;

import java.util.Map;
import java.util.Queue;

public class Producer {
    private static int producerCount = 0;
    private static final Map<String, Product> productMap = new HashMap<>();
    private static final Queue<Order> orderQueue = new LinkedList<>();

    public Producer(String productName, int produceTime) {
        Product product = new Product(productName, produceTime);
        Thread productThread = new Thread(product, "Pd" + ++producerCount);
        productThread.start();
        productMap.put(productName, product);
    }

    public static void main(String[] args) {
        Producer p = new Producer("WaterMelon", 2000);
        Producer s = new Producer("Pomegranate", 3000);

        // Simulate consumption
        consumeProduct("WaterMelon", 60);
        consumeProduct("Pomegranate", 30);
        consumeProduct("WaterMelon", 50); // This should trigger the queue mechanism
    }

    public static void consumeProduct(String productName, int count) {
        Product product = productMap.get(productName);
        if (product != null) {
            synchronized (product) {
                if (product.getCount() >= count) {
                    product.consume(count);
                    System.out.println("Consumed " + count + " of " + productName);
                } else {
                    System.out.println("Not enough " + productName + ". Adding order to queue.");
                    orderQueue.add(new Order(productName, count - product.getCount()));
                    product.consume(product.getCount());
                }
            }
        } else {
            System.out.println(productName + " not found.");
        }
    }

    static class Product implements Runnable {
        private String productName;
        private int count;
        private int produceTime;

        @Override
        public String toString() {
            return "Product [productName=" + productName + ", count=" + count + ", produceTime=" + produceTime + "]";
        }

        private static final Object lock = new Object();

        public Product(String productName, int produceTime) {
            this.productName = productName;
            this.count = 50; // Initial count
            this.produceTime = produceTime;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(produceTime);
                    synchronized (lock) {
                        count++;
                        System.out.println("Produced 1 " + productName + ". Total: " + count);

                    }
                } catch (InterruptedException e) {
                    System.out.println("Production interrupted for " + productName);
                    break;
                }
            }
        }

        public synchronized int getCount() {
            return count;
        }

        public synchronized void consume(int amount) {
            count -= amount;
        }

        public String getProductName() {
            return productName;
        }
    }

    static class Order {
        String productName;
        int quantity;

        @Override
        public String toString() {
            return "Order [productName=" + productName + ", quantity=" + quantity + "]";
        }

        public Order(String productName, int quantity) {
            this.productName = productName;
            this.quantity = quantity;
        }
    }
}
