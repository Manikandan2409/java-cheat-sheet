package threads;

public class Producer extends Thread {
    private Product product;

    Producer(String name, long produce_time) {
        super(name);
        product = new Product(name, produce_time);
    }

    @Override
    public void run() {
        product.produceProduct();
    }

    public Product getProduct() {
        return product;
    }

    public void stopProducer() {
        product.stopProducing();
    }

    static class Product {
        private static int total_product = 0;
        private int id;
        private String name;
        public String getName() {
            return name;
        }

        private int produced_size = 0;
        private int quantity;
        private long produce_time = 0;
        private volatile boolean running = true;

        @Override
        public String toString() {
            return "Product [id=" + id + ", name=" + name + ", produced_size=" + produced_size + ", quantity=" + quantity +", status="+running+ "]";
        }

        public void produceProduct() {
            while (running) {
                try {
                    Thread.sleep(produce_time);
                    synchronized (this) {
                        quantity++;
                        produced_size++;
                        System.out.println(this);
                        notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        Product(String name, long produce_time) {
            this.id = ++total_product;
            this.name = name;
            this.quantity = 0;
            this.produce_time = produce_time;
        }

        public synchronized boolean consumeProduct(int count, long timeout) {
            long startTime = System.currentTimeMillis();
            while (quantity < count) {
                long elapsed = System.currentTimeMillis() - startTime;
                if (elapsed >= timeout) {
                    System.out.println("Timed out");
                    return false;
                }
                try {
                    wait(timeout - elapsed);
                } catch (InterruptedException e) {
                    System.out.println("Exception: occurred while producing " + name);
                    return false;
                }
            }
            quantity -= count;
            return true;
        }

        public void stopProducing() {
            running = false;
        }
    }
}
