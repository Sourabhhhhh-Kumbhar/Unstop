public class DecimalToHexadecimal
{
    public static void main(String[] args)
    {
        // The decimal number to convert to hexadecimal
        int num = 50;

        // Integer.toHexString() is a built-in Java method that converts
        // an int into its hexadecimal representation as a String.
        // It handles everything internally — no manual math needed.
        // e.g. 50 in decimal = "32" in hex
        //   (3 * 16^1) + (2 * 16^0) = 48 + 2 = 50 ✓
        // Note: it returns lowercase letters for digits above 9
        // (a, b, c, d, e, f), not uppercase.
        String hex = Integer.toHexString(num);

        // Print the resulting hex string
        System.out.println(hex);
    }
}