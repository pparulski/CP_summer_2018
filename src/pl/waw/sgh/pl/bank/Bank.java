package pl.waw.sgh.pl.bank;

import pl.waw.sgh.pl.bank.exceptions.InvalidAmountException;
import sun.jvm.hotspot.debugger.win32.coff.DebugVC50SymbolIterator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Customer> custList = new ArrayList<>();

    List<Account> accList = new ArrayList<>();

    private Integer lastCustID = 0;
    private Integer lastAccID = 0;


    public Customer createCustomer(String firstName,
                                   String lastName,
                                   String email) {
        Customer customer = new Customer(lastCustID++, firstName, lastName, email);
        custList.add(customer);
        return customer;
    }

    public Account createAccount(Customer customer, boolean isSavings) {
        Account account = (isSavings ?
                                new SavingsAccount(lastAccID++, new BigDecimal(0), customer)
                                :
                                new DebitAccount(lastAccID++, new BigDecimal(0), customer));

        accList.add(account);
        return(account);
    }

    public void transfer(Integer fromAccountID, Integer toAccountID, double amount) throws InvalidAmountException {
        Account from = findAccountByID(fromAccountID);
        Account to = findAccountByID(toAccountID);

        from.charge(amount);
        to.deposit(amount);

    }

    public Account findAccountByID(Integer id) {
        for (int i = 0; i < accList.size(); i++) {
            while (id.equals(accList.get(i).getAccountID())) { //dont == because Integer is an object
                return accList.get(i);
            }
            }
            return null;
        }



    @Override
    public String toString() {
        return "Bank{" +
                "cust=" + custList +
                "\nacc=" + accList +
                '}';
    }
}

