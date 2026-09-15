public class HCFEuclidean
{
    public static int findHCF(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[])
    {
        System.out.println(findHCF(48,18));
    }
}