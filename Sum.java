class Yooo
{
    void sumUsingLoop(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += i;
        }
        System.out.println("Sum using loop: " + sum);
    }
}

public class Sum
{
    public static void main(String[] args)
    {
        int n = 10; // Example value for n
        Yooo yoo = new Yooo();
        yoo.sumUsingLoop(n);
    }
}