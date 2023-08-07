package Assignments;
import java.util.Scanner;

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

        Customer c1 = new Customer(customer1,11);
        Customer c2 = new Customer(customer2,10);

        Bank bank = new Bank(Arrays.asList(c1,c2));

        int operation;
        int typeofCustomer=1;
        Scanner scanner = new Scanner(System.in);


//        System.out.println(bank.getCustomerByCustomerID(10).getAccountByAccNo(9002));
//
//        System.out.println("adding 500 rupees and printing the balance only");
//
//        bank.getCustomerByCustomerID(10).getAccountByAccNo(9002).setCredit(500);
//
//        System.out.println("balance : "+bank.getCustomerByCustomerID(10).getAccountByAccNo(9002).getBalanceAmount());



        switch (typeofCustomer){

            case 1:

                System.out.println("Choose the Customer Type");
                System.out.println("1 : Customer\n2 : Bank\n");
                int options = scanner.nextInt();

                switch (options){
                    case 1:
                        System.out.println("Choose the operation");
                        System.out.println("1 : Debit\n2 : Credit\n3 : Check Balance\n4 : Main Menu");
                        operation= scanner.nextInt();
                        switch (operation){
                            case 1:
                                System.out.print("You have Selected Debit\nEnter the Account Number: ");
                                int accNo;
                                accNo = scanner.nextInt();
                                System.out.println("Enter the Secret Key : ");
                                int enteredKey;
                                enteredKey = scanner.nextInt();
                                System.out.println("Enter the Debit Amount");
                                int debitAmount =scanner.nextInt();
                                int debitMessage = bank.getCustomerByCustomerID(11).getAccountByAccNo(accNo).setDebit(debitAmount,enteredKey);
                                if(debitMessage == 200){
                                    System.out.println("The transaction is Successful!\n");
                                    System.out.println("Balance : "+bank.getCustomerByCustomerID(11).getAccountByAccNo(accNo).getBalanceAmount());

                                }else {
                                    System.out.println("Failed !! invalid Account Number or Secret Key");
                                }
                                break;

                            case 2:
                                System.out.print("You have Selected Credit\nEnter the Account Number: ");
                                int accNum;
                                accNum = scanner.nextInt();
                                System.out.println("Enter the Credit amount");
                                int creditAmount =scanner.nextInt();
                                bank.getCustomerByCustomerID(11).getAccountByAccNo(accNum).setCredit(creditAmount);
                                System.out.println("The transaction is Successful!!\n");
                                System.out.println("Balance : "+bank.getCustomerByCustomerID(11).getAccountByAccNo(accNum).getBalanceAmount());
                                break;
                            case 3:
                                System.out.println("Enter the Account Number");
                                int accNumberForBalanceCheck;
                                accNumberForBalanceCheck = scanner.nextInt();
                                System.out.println("Balance : "+bank.getCustomerByCustomerID(11).getAccountByAccNo(accNumberForBalanceCheck).getBalanceAmount());
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid Operation");
                                break;
                        }
                    break;
                    case 2:
                        System.out.println("the bank is under maintains");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                        break;

                }
                break;
            default:
                System.out.println("invalid choice");
        }

    }


    public static void filteredWIthAmount(List<Account> accountList){
        List<Account>filteredListWithAmount = accountList.stream().filter((e)->e.balanceAmount>1500).collect(Collectors.toList());
        System.out.println("The List of all accounts with grater than 1500 balance");
        filteredListWithAmount.forEach(System.out::println);
    }

}
