import java.util.Scanner; // needed to read input from the user

public class OctalToDecimal
{
    public static void main(String[] args)
    {
        // Create a Scanner to read input from standard input (keyboard)
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter an octal number
        System.out.print("Enter Octal Number: ");

        // Read the octal number as a String (not an int, since
        // "17" typed by the user is meant to be interpreted in base 8,
        // not base 10 — we let parseInt handle that interpretation)
        String octal = sc.next();

        // Integer.parseInt(String, radix) parses a string as a number
        // in the given base/radix. Here radix = 8, so each digit is
        // treated as a base-8 digit and converted to its base-10 value.
        // e.g. octal = "17" -> (1 * 8^1) + (7 * 8^0) = 8 + 7 = 15
        int decimal = Integer.parseInt(octal, 8);

        // Print the resulting decimal value
        System.out.println("Decimal Number: " + decimal);

        // Close the Scanner to release the input resource properly
        sc.close();
    }
}