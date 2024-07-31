package mentoring;

public class DepositTask implements Runnable {

    private BankAccount account;
    private int amount;

    public DepositTask(BankAccount account, int amount){
        this.account=account;
        this.amount=amount;
    }

    @Override
    public synchronized void run() {
        account.deposit(amount);
    }
}
