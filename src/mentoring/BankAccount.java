package mentoring;

public class BankAccount {

    int balance=0;

    public synchronized void deposit(int amount){
        balance+=amount;
    }

    public static void main(String[] args) {

        BankAccount account1=new BankAccount();

        DepositTask task1=new DepositTask(account1,100);
        DepositTask task2=new DepositTask(account1,200);
        DepositTask task3=new DepositTask(account1,300);
        DepositTask task4=new DepositTask(account1,250);
        DepositTask task5=new DepositTask(account1,150);

        Thread thread1=new Thread(task1);
        Thread thread2=new Thread(task2);
        Thread thread3=new Thread(task3);
        Thread thread4=new Thread(task4);
        Thread thread5=new Thread(task5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        System.out.println("Total balance: "+account1.balance);

    }

}
