package pl.waw.sgh.pl.bank.exceptions;

public class NonExistentAccountException extends BankException{
    public NonExistentAccountException(String s) {
        super(s);
    }
}
