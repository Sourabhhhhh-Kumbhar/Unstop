public class CheckArmstrong
{
    void check()
    {
        int num = 153, originalNum, remainder, result = 0;
        originalNum = num;
        while(originalNum != 0)
        {
            remainder = originalNum % 10;

            result += Math.pow(remainder, num);

            originalNum /= 10;
        }

        if (result == num)
        {
            System.out.println(num + " is Armstrong Number");
        }
        else
        {
            System.out.println(num + " is not Armstrong Number");
        }
    }

    public static  void main(String[] args)
    {
        CheckArmstrong obj = new CheckArmstrong();

        obj.check();
    }
}
