package Day1.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
    
    Employee employee1 = new Employee("karthik",21,2500,5,"HR",4,false);
    Employee employee2 = new Employee("aravind",22,2100,1,"technical",3,false);
    Employee employee3 = new Employee("adarsh",22,2500,3,"operation",3,false);
    Employee employee4 = new Employee("muiz",22,2200,2,"HR",4,false);
    Employee employee5 = new Employee("muhasin",22,3000,4,"HR",2,false);


    employees.add(employee1);
    employees.add(employee2);
    employees.add(employee3);
    employees.add(employee4);
    employees.add(employee5);

        System.out.println("list ----- "+employees);


        System.out.println("heiuiiu");
    List<Employee> filter_based_exp = employees.stream().filter((e)->e.yearsOfExp>2).map(e-> {
        e.pro = true;
        return e;
    }).collect(Collectors.toList());
    filter_based_exp.forEach(System.out::println);



    }


    
}
