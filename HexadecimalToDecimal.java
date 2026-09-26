public class HexadecimalToDecimal
{
    public static void main(String[] args)
    {
        // The hexadecimal number to convert, stored as a String.
        // Hex digits go beyond 0-9, using A-F for values 10-15,
        // so it can't be stored as a plain int directly — it has
        // to be parsed with the right base.
        String hex = "A3F";

        // Integer.parseInt(String, radix) parses the string as a number
        // in base 16 (hexadecimal) and converts it to a regular base-10 int.
        // Each character is interpreted as a hex digit:
        //   A = 10, 3 = 3, F = 15
        // So "A3F" = (10 * 16^2) + (3 * 16^1) + (15 * 16^0)
        //          = (10 * 256) + (3 * 16) + (15 * 1)
        //          = 2560 + 48 + 15
        //          = 2623
        int decimal = Integer.parseInt(hex, 16);

        // Print the resulting decimal value
        System.out.println(decimal);
    }
}