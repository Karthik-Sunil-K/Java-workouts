package Day1.Examples;

import java.util.HashSet;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("karthik");
        names.add("aravind");
        names.add("muhasin");
        names.add("muiz");

        for(String name : names){
            System.out.println(name);
        }
        System.out.println("next line");
        System.out.println(names); //will print as a list
        
    }
    
}
