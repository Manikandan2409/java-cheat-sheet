package threads;

public class Main {

    public static void main(String[] args) {
        Producer producer1 = new Producer("Watermelon", 1000);
        Producer producer2 = new Producer("Pomegranate", 2000);
        producer1.start();
        producer2.start();

        // Simulate consumer behavior
        new Thread(() -> {
            try {
                Thread.sleep(5000); // Wait for some products to be produced
                if (producer1.getProduct().consumeProduct(3,2000)) {
                    System.out.println("Consumed 3 Watermelons");
                } else {
                    System.out.println("Not enough Watermelons to consume");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(7000); // Wait for some products to be produced
                if (producer2.getProduct().consumeProduct(200,4000)) {

                    System.out.println("Consumed 2 Pomegranates");
                } else {
                    System.out.println("Not enough Pomegranates to consume");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
    
}
