class Yoo
{
    void SumRange(int n)
    {
        int start = 1 , end = 10;

        int sum = 0;

        for(int i = start; i <= end; i ++)
        {
            sum += i;
        }
        System.out.println("Sum from " + start + " to " + end + " is: " + sum);
    }
}

public class SumRange
{
    public static void main(String[] args)
    {
        int n = 10; // Example value for n
        Yoo yoo = new Yoo();
        yoo.SumRange(n);
    }
}