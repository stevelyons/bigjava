public class Fibonacci 
{
  public static void main(String[] args) 
  {
    int current, prev = 1, prevprev = 0;// Initialize some variables
    for(int i = 0; i < 20; i++) {       // Loop exactly 20 times
      current = prev + prevprev;        // Next number is sum of previous two
      System.out.print(current + " ");  // Print it out
      prevprev = prev;                  // First previous becomes 2nd previous
      prev = current;                   // And current number becomes previous
    }
    System.out.println();               // Terminate the line, and flush output
  }
}
