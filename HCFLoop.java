public class HCFLoop
{
    public static int findHCF(int a, int b)
    {
        while (a != b)
        {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
    public static void main(String[] args)
    {
        System.out.println(findHCF(48,18));
    }
}