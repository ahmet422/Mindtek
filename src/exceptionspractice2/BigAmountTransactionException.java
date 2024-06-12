package exceptionspractice2;

public class BigAmountTransactionException extends RuntimeException {

    public BigAmountTransactionException(String message) {
        super(message);
    }

}
