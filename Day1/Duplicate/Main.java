// PROGRAM: Eliminate the duplicate values from the given list 
// of values.

// [A,v,d,a,d,f,g,r,c,v,g,D,d,e,g]


package Day1.Duplicate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        List<String> myList = List.of("A","v","d","a","d","f","g","r","c","A");

        Set<String> mySet = new HashSet<>(myList);
        System.out.println(mySet);
    }

    
}