package threads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
public class Consumer {
    private static int total_consumer = 0;
    private int id;
    private ConsumeProduct product;
    private long waitingtime;

    public int getId() {
        return id;
    }
    public ConsumeProduct getProduct() {
        return product;
    }
    public long getWaitingtime() {
        return waitingtime;
    }
    @Override
    public String toString() {
        return "Consumer [id=" + id + ", product=" + product + ", waitingtime=" + waitingtime + "]";
    }

    private Resource rs = Resource.getInstance();
    private Random random = new Random();
 

    Consumer() {
        this.id = ++total_consumer;
        this.waitingtime = 10000l; // 10sec
        this.product = new ConsumeProduct(rs.getProductName()[random.nextInt(rs.getProductName().length)],
                random.nextInt(5) + 1);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id,product,waitingtime);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() == obj.getClass()) return true;
        Consumer consumer = (Consumer)obj;
        return id==consumer.id && Objects.equals(product, consumer.product) && waitingtime == consumer.waitingtime;
    }

    class ConsumeProduct {

        private String product;
        private int count;

        public String getProduct() {
            return product;
        }

        public int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return "ConsumeProduct [product=" + product + ", count=" + count + "]";
        }

        ConsumeProduct(String product, int count) {
            this.product = product;
            this.count = count;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, product, waitingtime);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() == obj.getClass())
                return true;
            ConsumeProduct product = (ConsumeProduct) obj;
            return (count == product.count) && Objects.equals(this.product, product.product);
        }
    }

}