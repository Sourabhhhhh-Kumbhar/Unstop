public class GCMBasedLCM
{
    public static int gcd (int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b)
    {
        return (a * b)/ gcd(a, b);
    }
    public static void main(String[]args)
    {
        int a = 12, b = 18;
        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a,b));
    }
}
