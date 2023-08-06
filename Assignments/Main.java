package Assignments;

import Day1.Employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();

        Account account1 = new Account(9001,"Savings",1000,123);
        Account account2 = new Account(9002,"Current",2000,456);
        Account account3 = new Account(9003,"Fixed",1500,213);
        Account account4 = new Account(9004,"Savings",3000,998);
        Account account5 = new Account(9005,"Savings",5000,343);

        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        accountList.add(account4);
        accountList.add(account5);


    }

    public static void filteredWIthAmount(List<Account> accountList){
        List<Account>filteredListWithAmount = accountList.stream().filter((e)->e.balanceAmount>1500).collect(Collectors.toList());
        System.out.println("The List of all accounts with grater than 1500 balance");
        filteredListWithAmount.forEach(System.out::println);
    }


}
