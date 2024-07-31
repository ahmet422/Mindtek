package multithreading;

import java.util.ArrayList;

public class WithSynchronizationExample1 {
    static ArrayList<Integer> list = new ArrayList<>();
    static Object lock = new Object(); // Object used for synchronization

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    list.add(i);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 5; i < 10; i++) {
                    list.add(i);
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < list.size(); i++) {
                    list.set(i,list.get(i)+1);
                    System.out.println('*');
                }
            }
        });



        thread2.start();
        thread1.start();
        thread3.start();


        thread1.join();
        thread2.join();

        // No race condition: size should always be 2000 due to synchronized
        // access
        System.out.println("Size of list (with synchronization): " +
                list.size());
        System.out.println(list);
    }
}
