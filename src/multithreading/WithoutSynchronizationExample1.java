package multithreading;

import java.util.ArrayList;

public class WithoutSynchronizationExample1 {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                list.add(i);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        // Race condition possible: size may not be 2000 due to concurrent
        //modifications
        System.out.println("Size of list (without synchronization): " +
                list.size());
        System.out.println(list);
    }
}
