/*
      To check whether a particular value exists in HashSet use
      boolean contains(Object value) method of HashSet class.
      It returns true if the HashSet contains the value, otherwise false.
  */
import java.util.HashSet;
public class HashSetExample
{
  public static void main(String[] args)
  {
    //create object of HashSet
    HashSet hSet = new HashSet();
   
    //add elements to HashSet object
    hSet.add(new Integer("1"));
    hSet.add(new Integer("2"));
    hSet.add(new Integer("3"));
    boolean blnExists = hSet.contains(new Integer("3"));
    System.out.println("3 exists in HashSet ? : " + blnExists);
  }
}
