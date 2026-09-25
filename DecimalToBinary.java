import java.util.Scanner; // needed to read input from the user

public class DecimalToBinary
{
    public static void main(String args[])
    {
        // Create a Scanner to read input from standard input (keyboard)
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");

        // Read an integer typed by the user
        // (nextInt() reads only the numeric token, unlike nextLine())
        int decimal = sc.nextInt();

        // Integer.toBinaryString() is a built-in Java method that converts
        // an int into its binary representation as a String.
        // e.g. decimal = 13 -> binary = "1101"
        // Internally it works on the number's two's complement bit pattern,
        // which is why negative numbers produce long 32-bit strings —
        // but for positive numbers it behaves exactly as expected.
        String binary = Integer.toBinaryString(decimal);

        // Print the resulting binary string
        System.out.println("Binary Number: " + binary);

        // Close the Scanner to release the input resource properly
        sc.close();
    }
}