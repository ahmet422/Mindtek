package exceptionspractice2;

import java.net.URL;

public class AccountHolder {

    public static void main(String[] args) throws InsufficientFundsException {

        BankAccount bankAccount=new BankAccount();

        bankAccount.deposit(100);
        bankAccount.makeTransaction(20);

        // bankAccount.makeTransaction(90);

        CheckingAccount checkingAccount=new CheckingAccount();

        checkingAccount.deposit(25000);
        checkingAccount.makeTransaction(21000);

    }

}
