package threads;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import threads.Consumer.ConsumeProduct;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Boolean> deliveryStatus = new TreeMap<>();
        
        Producer producer1 = new Producer("Watermelon", 1000);
        Producer producer2 = new Producer("Pomegranate", 2000);

        producer1.start();
        producer2.start();

        List<Thread> consumerThreads =Collections.synchronizedList( new LinkedList<>());

        for (int i = 0; i < 20; i++) {

            final int index = i;
            Thread consumerThread = new Thread(() -> {
                try {
                    Consumer consumer = new Consumer();
                    ConsumeProduct product = consumer.getProduct();
                    System.out.println(consumer + " iteration =" + index);
                    if (product.getProduct().equals(producer1.getName())) {
                        deliveryStatus.put(index,
                                producer1.getProduct().consumeProduct(product.getCount(), consumer.getWaitingtime()));
                    }
                    if (product.getProduct().equals(producer2.getName())) {
                        deliveryStatus.put(index,
                                producer2.getProduct().consumeProduct(product.getCount(), consumer.getWaitingtime()));
                    }
                    Thread.sleep(consumer.getWaitingtime());
                } catch (Exception e) {
                    e.printStackTrace(); 
                }
            });
            consumerThreads.add(consumerThread);
            consumerThread.start();
        }

        for (Thread consumerThread : consumerThreads) {
            try {
                 
                consumerThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {

            producer1.stopProducer();
            producer2.stopProducer();

            producer1.join();
            producer2.join();
        } catch (Exception e) {
        
        }

        deliveryStatus.entrySet().forEach(e -> {
            System.out.println("id=" + e.getKey() + " delivered=" + e.getValue());
        });

        try {
            producer1.join();
            producer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}