public class TypeCasting
{
  public static void main(String[]args)
  {
    short x = 129;
    byte y = (byte)x; //need to type cast here. size of x = 16-bit > size of y = 8-bit
    System.out.println("value of x = "+x);
    System.out.println("value of y = "+y);
  }
}
