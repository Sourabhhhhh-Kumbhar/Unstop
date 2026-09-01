
public class ArmstrongNumber
{
    public static boolean isArmstrong(int num)
    {
        int originalNum = num;
        int sum = 0;
        int n = String.valueOf(num).length();

        while(num > 0)
        {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num = num / 10;
        }

        return sum == originalNum;
    }

    public static void main(String args[])
    {
       int number = 153;

       if(isArmstrong(number))
       {
           System.out.println(number + " is Armstrong Number");
       }
       else
       {
           System.out.println(number + " is Not Armstrong Number");
       }
    }
}