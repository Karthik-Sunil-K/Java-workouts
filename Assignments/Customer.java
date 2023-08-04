package Assignments;

import java.util.List;

public class Customer {
    List<Account> accountList;
    @Override
    public String toString() {
        return "Customer{" +
                "accountList=" + accountList +
                '}';
    }
    public Customer(List<Account> accountList) {
        this.accountList = accountList;
    }
}
