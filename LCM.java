public class LCM
{
    public static long lcm(long a,long b)
    {
        if(a <= 0 || b <= 0) throw new IllegalArgumentException("Inputs must be positive");

        long max = Math.max(a, b);
        long candidate = max;
        while(true)
        {
            if(candidate % a == 0 && candidate % b == 0)
            {
                return candidate;
            }
            candidate = candidate + max;
        }
    }

    public static void main(String[]args)
    {
        long a = 12;
        long b = 15;

        System.out.println("LCM: " + lcm(a,b));
    }
}

//LCM stands for Least Common Multiple.
//
//It is the smallest positive number that is a multiple of two or more numbers.
//
//        Example: LCM of 4 and 6
//
//Multiples of 4:
//        4, 8, 12, 16, 20, 24...
//
//Multiples of 6:
//        6, 12, 18, 24...
//
//The first number appearing in both lists is 12.