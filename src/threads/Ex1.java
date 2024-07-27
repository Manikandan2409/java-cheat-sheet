package threads;

/**
 * Test1
 */
class Test1 extends Thread {
    private static int num = 1;
    int nth_thread = 0;

    public Test1() {
        nth_thread = num++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread  " + nth_thread + " : " + i);
            try {
                Thread.sleep(1000 * nth_thread);
            } catch (InterruptedException e) {
                System.out.println("Interupt occuur in thread :" + nth_thread);
            }
        }
    }

}

public class Ex1 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        t1.start();
        t2.start();
        try {
        Thread.sleep(3000);
        t1.checkAccess();

        System.out.println("Priority t1 and t2 :"+ t1.getPriority()+" "+t2.getPriority());

        t1.join();
        t2.join();
        } catch (Exception e) {

        }
        System.out.println("Main ends");
    }
}
