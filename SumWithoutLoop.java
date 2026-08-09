class Hahaha
{
    void sumWithoutLoop()
    {
        int n = 10;

        int sum = n * (n + 1) / 2;

        System.out.println(sum);
    }
}

public class SumWithoutLoop
{
    public static void main(String[] args)
    {
        Hahaha h = new Hahaha();

        h.sumWithoutLoop();
    }
}