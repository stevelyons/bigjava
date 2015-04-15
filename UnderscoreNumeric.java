public class UnderscoreNumeric
{
    public static void main(String[] args) {
        //
        // Write numeric literals using underscore as an easier way
        // to read long numbers.
        //
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;
 
        if (maxInt == Integer.MAX_VALUE) {
            System.out.println("maxInt = " + maxInt);
        }
 
        if (minInt == Integer.MIN_VALUE) {
            System.out.println("minInt = " + minInt);
        }
 
        //
        // Write numbers in binary or hex literals using the
        // underscores.
        //
        int maxIntBinary = 0B111_1111_1111_1111_1111_1111_1111_1111;
        int maxIntHex    =   0X7____F____F____F____F____F____F____F;
 
        System.out.println("maxIntBinary = " + maxIntBinary);
        System.out.println("maxIntHex    = " + maxIntHex);
 
    }
}
