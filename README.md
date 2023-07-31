**HASHMAP**

Example: Key as String and Value as Class

Main.java 

    package Smartphone;

    import java.util.HashMap;

    public class Main {
        public static void main(String[] args) {

            Smartphone phone1 = new Smartphone();
            Smartphone phone2 = new Smartphone();

            phone1.brand="samsung";
            phone1.ram=16;
            
            phone2.brand="iphone";
            phone2.ram=8;
            HashMap<String,Smartphone> smartphone = new HashMap<>();
            smartphone.put("phone1", phone1);
            smartphone.put("phone2", phone2);

            for(String key : smartphone.keySet()){
                Smartphone newphone = smartphone.get(key);
                System.out.println("the key is "+key+" and the pair is "+newphone.brand);
            }

        }
        
    }

Smartphone.java

package Smartphone;

    public class Smartphone {
        String brand;
        String model;
        int ram;
        float screen;
        String OS;
    }

### ArrayList
Note:
- To covert a list to hashmap just create a hashmap object and pass the list the new hashmap list will eliminate all the repeating values inside the list and give a new list

- if we want to get an parameter from a arraylist called names with index number 3 then we need to call it as names.get(3)

- names.add("string") can use for adding an element in a arraylist

- names.remove can be use for removing an element

- names.contain("string") to check whether an element is contain or not

- maintain insersion order

- to itrate in the list use a for loop 

    for(String name : names){
        System.out.println(name)
    }

### LinkedSet
Note:

- Similar to ArrayList only change in the internal operation

- maintain insertion order 

### Hashset
Note:
- The major difference btwn ArrayList and HashSet is in Hashset the duplicates will terminate 

- cannot have duplicate value

- can use where the unique value is required 

- does not maintain insertion order

-  IMP: if it comes to two object then it will take both and will not remove the duplicate one so if we want to remove the duplicate one we need to use 
    #### Equals
    - if you want to equate objects you need to use equals and specify the params to be check for equating 





