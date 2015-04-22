public class StringConcatAlt
{ 
  public static void main(String args[]) 
  {
    String firstname = "Virat"; 
    String lastname = "Kohli"; 
    // 1st way - Use + operator to concatenate 
    String String name = firstname + " " + lastname; 
    System.out.println(name);
    
    // 2nd way - by using StringBuilder 
    StringBuilder sb = new StringBuilder(14);
    sb.append(firstname).append(" ").append(lastname); System.out.println(sb.toString()); 
    
    // 3rd way - by using StringBuffer 
    StringBuffer sBuffer = new StringBuffer(15);
    sBuffer.append(firstname).append(" ").append(lastname);
    System.out.println(sBuffer.toString()); 
    } 
} 

