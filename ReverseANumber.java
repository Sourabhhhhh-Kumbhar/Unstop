import java.util.Scanner;

class NumberReverse
{
    void  reverse()
    {
        int n = 123456789;
        int reversed = 0;

        while(n != 0)
        {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}

public class ReverseANumber
{
    public static void main(String args[])
    {
        NumberReverse obj = new NumberReverse();
        obj.reverse();
    }
}

