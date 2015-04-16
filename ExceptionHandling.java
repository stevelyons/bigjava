import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
public class ExceptionHandling {  
 public static void main(String args[]){  
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  
  System.out.println("Enter your name : ");  
  try {  
   String input = reader.readLine();  
   System.out.println("You typed : "+input); // Exception prone area  
  } catch (IOException e) {  
   e.printStackTrace();  
  }  
 }  
}  
