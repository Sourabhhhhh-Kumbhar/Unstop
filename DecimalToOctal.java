public class DecimalToOctal
{
    public static void main(String args[])
    {
        // The decimal number we want to convert to octal.
        // (Hardcoded here instead of taken as input — just a fixed value)
        int n = 88;

        // This will build up the octal result as a String, digit by digit.
        // Starts empty since we haven't computed any digits yet.
        String octal = "";

        // Keep dividing by 8 until nothing is left to convert.
        // This is the standard "divide by base, collect remainders" method
        // for converting decimal to any other base.
        while (n > 0)
        {
            // n % 8 gives the remainder when dividing by 8 — this is the
            // LEAST significant octal digit at this step.
            // We prepend it to "octal" (instead of appending) because
            // digits come out in reverse order (rightmost digit first),
            // so each new digit needs to go in FRONT of what we have so far.
            octal = (n % 8) + octal;

            // Integer division by 8 chops off the digit we just extracted,
            // shifting to the next digit for the next loop iteration.
            n = n / 8;
        }

        // Print the final octal string built up over all iterations
        System.out.println("Octal: " + octal);
    }
}