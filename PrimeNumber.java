class Prime
{
    static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int n = 7;

        boolean result = Prime.isPrime(n);

        System.out.println("Is " + n + " prime? " + result);
    }
}