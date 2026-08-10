class PrimeRange
{
    void checkPrime(int n)
    {
        int start = 10;
        int end = 20;

        System.out.println("Prime numbers between " + start + " and " + end + "are:");

        for(int i = start; i <= end; i++)
        {
            boolean isPrime = true;

            if (i <= 1)
                continue;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

public class PrimeRangeCheck
{
    public static void main(String[] args)
    {
        PrimeRange p = new PrimeRange();

        p.checkPrime(10);
    }
}
