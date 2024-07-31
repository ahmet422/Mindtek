package multithreading;

import moviesapp.Movie;

public class WaitNotifyExample {
    static Object object = new Object();
    static Movie m1 = new Movie();
    static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {

        Thread producer = new Thread(() -> {
            synchronized (object) {
                System.out.println("Producer: Producing...");
                flag = true;
                object.notifyAll(); // Notify waiting threads
            }
        });

        Thread consumer = new Thread(() -> {
            synchronized (object) {
                while (!flag) {
                    try {
                        System.out.println("Consumer: Waiting...");
                        object.wait(); // Wait until notified
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumer: Consuming...");
            }
        });

        consumer.start();
        Thread.sleep(1000); // Ensure consumer starts waiting first
        producer.start();

        consumer.join();
        producer.join();
    }
}
