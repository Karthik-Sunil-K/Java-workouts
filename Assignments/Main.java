package Assignments;

import Day1.Employee.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Account> customer1 = new ArrayList<>();
        List<Account> customer2 = new ArrayList<>();


        Account account1 = new Account(9001,"Savings",1000,123);
        Account account2 = new Account(9002,"Current",2000,456);
        Account account3 = new Account(9003,"Fixed",1500,213);
        Account account4 = new Account(9004,"Savings",3000,998);
        Account account5 = new Account(9005,"Savings",5000,343);

        customer1.add(account1);
        customer1.add(account2);
        customer2.add(account3);
        customer2.add(account4);
        customer2.add(account5);

        Customer c1 = new Customer(customer2,11);
        Customer c2 = new Customer(customer1,10);

        Bank bank = new Bank(Arrays.asList(c1,c2));


        System.out.println(bank.getCustomerByCustomerID(10).getAccountByAccNo(9002));



//        filteredWIthAmount(accountList);
//        int creditAmount = 800;
//        setCredit(creditAmount);

    }

    public static void filteredWIthAmount(List<Account> accountList){
        List<Account>filteredListWithAmount = accountList.stream().filter((e)->e.balanceAmount>1500).collect(Collectors.toList());
        System.out.println("The List of all accounts with grater than 1500 balance");
        filteredListWithAmount.forEach(System.out::println);
    }
    public static void setCredit(int creditAmount){

    }


}
