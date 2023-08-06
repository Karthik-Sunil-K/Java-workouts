package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {
    List<Customer> customerList = new ArrayList<>();

    public Bank(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public Customer getCustomerByCustomerID(int cusId){
        return this.customerList.stream().filter((c)->c.customerID==cusId).collect(Collectors.toList()).get(0);
    }
}
