public class PrimeFactor
{

    void primeFactor()
    {
        int n = 56;

        System.out.println("Prime Factors of " + n + ": ");

        for(int i = 2; i <= n; i++)
        {
            while (n % i == 0)
                {
                System.out.println(i + " ");
                n = n / i;
                }
        }
    }

    public static void main (String[] args)
    {
        PrimeFactor pf = new PrimeFactor();
        pf.primeFactor();
    }
}
