public class JaggedArray 
{
    public static void main(String[] args) {

	// Create an array of String arrays: a jagged array.
	String[][] values = new String[2][];

	// Fill first row with 2-element array.
	values[0] = new String[2];
	values[0][0] = "cat";
	values[0][1] = "dog";

	// Use 3-element array for second row.
	values[1] = new String[3];
	values[1][0] = "fish";
	values[1][1] = "bird";
	values[1][2] = "lizard";

	// Display rows and elements.
	for (String[] array : values) {
	    for (String element : array) {
		System.out.print(element);
		System.out.print(" ");
	    }
	    System.out.println();
	}
    }
}
