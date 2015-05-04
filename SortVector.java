import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;
 
public class SortVector
{
 
  public static void main(String[] args) {
   
    //create a Vector object
    Vector v = new Vector();
   
    //Add elements to Vector
    v.add("1");
    v.add("2");
    v.add("3");
    v.add("4");
    v.add("5");
   

    Comparator comparator = Collections.reverseOrder();
   
    System.out.println("Before sorting Vector in descending order : " + v);
   
    Collections.sort(v,comparator);
    System.out.println("After sorting Vector in descending order : " + v);
   
  }
}
