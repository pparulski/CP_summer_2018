package pl.waw.sgh.pl.bank;

import pl.waw.sgh.pl.bank.exceptions.InvalidAmountException;

public class PlayWithBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer c1 = bank.createCustomer("Anne", "Brown", "anne@brown.com");
        Customer c2 = bank.createCustomer("John", "Smith", "john@smith.com");

        Account acc1 = bank.createAccount(c1, false);
        Account acc2 = bank.createAccount(c1, true);

        Account acc3 = bank.createAccount(c2, false);
        Account acc4 = bank.createAccount(c2, true);

        acc1.deposit(100);
        try {
            bank.transfer(0,3,200);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(bank);

        /*/
            3 cases:
                1. Non existing account
                2. Negative amount
                3. Not enough money


            4-5 classes
            about 300 line of codes
            deadline: second week of the session

            classes:
             gui
             db (jdbc sql, spring data)
             web apps (vaadin, rest)
             multithreaded apps

             hw:
             extra points (cases 1. and 2. exception handling)
         */

    }
}
