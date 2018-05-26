package pl.waw.sgh.pl.bank;

import pl.waw.sgh.pl.bank.exceptions.InvalidAmountException;

import java.math.BigDecimal;

public abstract class Account {

    private Integer accountID;
    private BigDecimal balance;
    private Customer customer;
    private String currency = "USD";

    public Account(Integer accountID, BigDecimal balance, Customer customer) {
        this.accountID = accountID;
        this.balance = balance;
        this.customer = customer;
    }

    public void deposit(double amount){
        balance = balance.add(BigDecimal.valueOf(amount));
    }



    public void charge(double amount) throws InvalidAmountException {
        if(balance.doubleValue()<amount)
        {
            throw new InvalidAmountException(
                    "Not enough money, you tried to charge: " + amount + " only: " + balance + " available"
            );
        }
        balance = balance.subtract(BigDecimal.valueOf(amount));
    }



    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName().replace("Account","") + "{" +
                "" + accountID +
                ", " + balance + " " + currency +
                ", cust=" + customer.getCustomerID() +
                '}';
    }
}


//create another csv file with new column that is "change" of open and close