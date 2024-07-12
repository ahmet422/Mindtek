package multithreading;

public class Intro {
    // Single thread : only one thread in app
    // Multithreading : multiple actions simultaneously
    public static void main(String[] args) {

        Runnable myReader = new Runnable() {
            @Override
            public void run() {
                // 1 code reads from file -> 1 million pages
                // adfdga
                // asdgfadfg
                // afdgadgf
            }
        };
        Thread readerThr = new Thread(myReader);
        readerThr.start();

        Runnable mySender = new Runnable() {
            @Override
            public void run() {
                // 2 send emails to some people
                // adfdga -> construct email
                // asdgfadfg -> sending email
                // afdgadgf
            }
        };
        Thread emailSenderThr = new Thread(mySender);
        emailSenderThr.start();


        System.out.println("Started");

        NumberPrinter thread = new NumberPrinter("ThOne");
        thread.setPriority(1);
        thread.start();

        System.out.println("ThOne priority " + thread.getPriority());
        String name = thread.getName();
        System.out.println("***" + name + "***");
        for(int i = 0; i < 5; i++) System.out.println("main -> " + i);

        NumberPrinter thread2 = new NumberPrinter("ThTwo");
        thread2.start();

        for(int i = 0; i < 5; i++) System.out.println("main2 -> " + i);

        MyThread thread0 = new MyThread();
        thread0.run();

        // anonymous implementation
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous implementation");
            }
        };

         // myRunnable.run(); -> run method executed like a standard method
        Thread thrObject1 = new Thread(myRunnable);
        thrObject1.start();
        // lambda exp
        Runnable runnable = () -> { System.out.println("lambda");};

        runnable.run();
        Thread throbject2 = new Thread(runnable);
        throbject2.start();


    }

    // Ways to create thread objects:
    // 1 extend Thread class
    // 2 implement Runnable interface
    // 3 Anonymous implementation
    // 4 Lambda function


}
