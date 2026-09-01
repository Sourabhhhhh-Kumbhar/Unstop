public class ArmstrongInRange
{
    void  check()
    {
        int start = 100, end = 999;

        System.out.println("Armstrong Numbers between "+ start +" and "+ end);

        for(int num = start; num <= end; num++)
        {
            int originalNum = num, remainder, result = 0;
            int n = String.valueOf(num).length();

            while(originalNum != 0)
            {
                remainder = originalNum % 10;
                result += Math.pow(remainder, n);
                originalNum /= 10;
            }
            if(result == num)
            {
                System.out.println(num + " is Armstrong Number");
            }
            else
            {
                System.out.println(num + " is not Armstrong Number");
            }
        }
    }

    public static void main(String[] args)
    {
        ArmstrongInRange obj = new ArmstrongInRange();

        obj.check();
    }
}
