public class DecimalToOctal
{
    public static void main(String args[])
    {
        int n = 88;
        String octal = "";
        while(n > 0)
        {
            octal = (n % 8) + octal;
            n = n / 8;
        }
        System.out.println("Octal: " + octal);
    }
}