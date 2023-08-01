package Day1.Smartphone;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        Map<String,Smartphone> smartphones = new HashMap<>();

        Smartphone phone1 = new Smartphone();
        Smartphone phone2 = new Smartphone();
        Smartphone phone3 = new Smartphone();

        phone1.ram=8;
        phone1.model="S23";
        phone1.screen=6.1;
        phone1.OS = "Android";

        phone2.ram=16;
        phone2.model="14Pro";
        phone2.screen=6.6;
        phone2.OS="IOS";

        phone3.ram=12;
        phone3.model="A23";
        phone3.screen=5.5;
        phone3.OS="Android";


        smartphones.put("samsung", phone1);
        smartphones.put("iphone", phone2);
        smartphones.put("Vivo",phone3);

        for(String key : smartphones.keySet()){

            Smartphone smartphone = smartphones.get(key);
            if(smartphone.OS.equals("Android")){
                System.out.println(smartphone.model);
            }

        }
    }
}
