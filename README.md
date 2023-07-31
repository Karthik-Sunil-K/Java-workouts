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
