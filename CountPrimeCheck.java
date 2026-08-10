
class CountPrime
{
    public static boolean isPrime(int n)
    {
        int count = 0;

        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
                count++;
        }
        return count == n;
    }
}

public class CountPrimeCheck
{
    public static void main(String[] args)
    {
        System.out.println(CountPrime.isPrime(121));
        System.out.println(CountPrime.isPrime(12434));
        System.out.println(CountPrime.isPrime(444));
    }
}