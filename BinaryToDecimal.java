import java.util.Scanner; // needed to read input from the user (keyboard)

public class BinaryToDecimal
{
    public static void main(String args[])
    {
        // Create a Scanner object to read input from standard input (System.in)
        Scanner sc = new Scanner(System.in);

        // Ask the user to type a binary number
        System.out.print("Enter Binary Number: ");

        // Read the entire line the user typed, store it as a String
        // e.g. binary = "1011"
        String binary = sc.nextLine();

        // This will hold the final decimal result. Starts at 0 and
        // we add to it as we process each bit.
        int decimal = 0;

        // Loop through every character (bit) in the binary string,
        // starting from index 0 up to the last character
        for (int i = 0; i < binary.length(); i++)
        {
            // We want to process bits from RIGHT to LEFT (least significant
            // bit first), because the rightmost bit represents 2^0,
            // the next one 2^1, and so on.
            // binary.length() - 1 - i gives us that reversed index:
            //   i = 0 -> last character (rightmost bit)
            //   i = 1 -> second-to-last character
            //   ...and so on
            char bit = binary.charAt(binary.length() - 1 - i);

            // Only add to the total if the bit is '1'.
            // A '0' bit contributes nothing, so we skip it.
            if (bit == '1')
            {
                // Each bit's position (i) corresponds to a power of 2.
                // Rightmost bit (i=0) = 2^0 = 1
                // Next bit (i=1)      = 2^1 = 2
                // Next bit (i=2)      = 2^2 = 4, and so on.
                // Math.pow returns a double, so it gets implicitly
                // converted to int when added to "decimal".
                decimal += Math.pow(2, i);
            }
        }

        // Print the final computed decimal value
        System.out.println("Decimal equivalent to: " + decimal);

        // Close the Scanner to release the input resource properly
        sc.close();
    }
}