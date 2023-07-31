// PROGRAM :Create a list of colours in the rainbow and do the following:

// Print the last colour
// Change the 4th colour to purple and print all the colours

package Day1.Rainbow;
import java.util.ArrayList;


public class Main{
    public static void main(String[] args) {
    ArrayList<String> rcolor = new ArrayList<String>();

    rcolor.add("Red");
    rcolor.add("Orange") ;
    rcolor.add("yellow");
    rcolor.add("green");
    rcolor.add("blue");
    rcolor.add("indigo");
    rcolor.add("violet");
    System.out.println("printing the last color :"+rcolor.get(rcolor.size()-1));
    rcolor.set(3, "purple");
    System.out.println(rcolor);
    }
}
 