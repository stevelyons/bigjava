/*
  By default, StringTokenizer object does not return the delimiters along
  with the string tokens. To return the delimiter along with the string tokens, use
  StringTokenizer(String str, String delim, boolean returnDelims) construcor
*/
    
import java.util.StringTokenizer;
public class StringTokenizer
{
  public static void main(String[] args)
  {
    //Create StringTokenizer object
    StringTokenizer st = new StringTokenizer("Java|StringTokenizer|Example 1",
                                                 "|", true);
    //iterate through tokens
    while(st.hasMoreTokens())
      System.out.println(st.nextToken("|"));
  }
}
