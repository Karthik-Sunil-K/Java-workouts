package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account account1 = new Account(9001,"karthik",1000,123);
        Account account2 = new Account(9002,"aravind",2000,456);
        Account account3 = new Account(9003,"ajith",1500,213);
        Account account4 = new Account(9004,"muiz",3000,998);
        Account account5 = new Account(9005,"babu",5000,343);

        bank.add(account1);
        bank.add(account2);
        bank.add(account3);
        bank.add(account4);
        bank.add(account5);
    }
}
