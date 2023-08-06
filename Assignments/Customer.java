package Assignments;

import java.util.List;
import java.util.stream.Collectors;

public class Customer {
    int customerID;
    List<Account> accountList;
    @Override
    public String toString() {
        return "Customer{" +
                "accountList=" + accountList +
                '}';
    }
    public Customer(List<Account> accountList,int customerID) {
        this.accountList = accountList;
        this.customerID = customerID;
    }
    public Account getAccountByAccNo(int accNo){
        return this.accountList.stream().filter((a)->a.accountNo ==accNo).collect(Collectors.toList()).get(0);
    }
}
