class SumDigits
{
    public static int  sumDigits(int n)
    {
        int sum=0;

        while(n > 0)
        {
            int digit = n % 10;

            sum = sum + digit;
            n = n/10;
        }
        return sum;
    }
}

public class SumofDigits
{
    public static void main(String[] args)
    {
        int n = 821;

        System.out.println("Sum of Digits: " + SumDigits.sumDigits(n));
    }
}