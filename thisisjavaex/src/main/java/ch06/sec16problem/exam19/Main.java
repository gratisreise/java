package ch06.sec16problem.exam19;

import ch06.sec13.exam2.package1.A;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("account.getBalance() = " + account.getBalance());

        account.setBalance(-100);
        System.out.println("account.getBalance() = " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("account.getBalance() = " + account.getBalance());

        account.setBalance(300000);
        System.out.println("account.getBalance() = " + account.getBalance());
    }
}
