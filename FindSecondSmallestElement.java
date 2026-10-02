// This class finds the second smallest element in an array
public class FindSecondSmallestElement
{
    public static void main(String[] args)
    {
        // An array containing integer values
        int[] arr = {52, 23, 33, 14, 19, 24, 22};

        // Integer.MAX_VALUE gives the largest possible int value.
        // We use it as an initial value so that any smaller number
        // in the array can replace it.
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Enhanced for loop: visits each element of the array one by one.
        // 'num' stores the current element during each iteration.
        for (int num : arr)
        {
            // If the current number is smaller than the smallest number
            // found so far, update both variables.
            if (num < smallest)
            {
                // The previous smallest becomes the second smallest.
                secondSmallest = smallest;

                // The current number becomes the new smallest.
                smallest = num;
            }
            // If the number is not the smallest, check whether it can
            // become the second smallest.
            else if (num < secondSmallest && num != smallest)
            {
                // Update secondSmallest if the current number is
                // smaller than the current second smallest.
                // num != smallest prevents counting duplicate values
                // as the second smallest distinct element.
                secondSmallest = num;
            }
        }

        // If secondSmallest was never updated, it means that no
        // second distinct smallest element was found.
        if (secondSmallest == Integer.MAX_VALUE)
        {
            System.out.println("No second smallest element");
        }
        else
        {
            // Print the second smallest distinct element.
            System.out.println("Second Smallest Element: " + secondSmallest);
        }
    }
}
