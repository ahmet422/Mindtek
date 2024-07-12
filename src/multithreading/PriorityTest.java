package multithreading;

public class PriorityTest extends Thread{
    @Override
    public void run() {
        System.out.println("Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        PriorityTest t1 = new PriorityTest();
        PriorityTest t2 = new PriorityTest();
        PriorityTest t3 = new PriorityTest();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(3);
        t2.start();
        t1.start();
        t3.start();
    }
}
