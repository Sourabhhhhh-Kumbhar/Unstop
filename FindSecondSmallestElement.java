public class FindSecondSmallestElement
{
    public static void main(String[] args)
    {
        int[] arr = {52, 23, 33, 14, 19, 24, 22};
        int smallest  = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int num : arr)
        {
            if(num < smallest)
            {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num != smallest)
            {
                secondSmallest = num;
            }
        }
        if(secondSmallest == Integer.MAX_VALUE)
        {
            System.out.println("No second smallest element");
        }
        else
        {
            System.out.println("Second Smallest Element: " + secondSmallest);
        }
    }
}
