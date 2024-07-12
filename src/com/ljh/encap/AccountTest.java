package com.ljh.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setPassword("12356");
        account.setName("1234");
        account.setBalance(21);

        account.info();

    }
}
