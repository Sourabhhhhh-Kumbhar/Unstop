
public class KTHSmallestElement
{
    // Finds the kth smallest element in the array
    public static int quickSelect(int[] arr, int k)
    {
        // Convert k to a zero-based index
        // Example: 1st smallest -> index 0
        return select(arr, 0, arr.length - 1, k - 1);
    }

    // Selects the element at the required index
    public static int select(int[] arr, int low, int high, int k)
    {
        // Continue until the correct element is found
        while (low <= high)
        {
            // Choose the last element as the pivot
            int pivot = arr[high];

            // i tracks the position for elements smaller than pivot
            int i = low;

            // Move elements smaller than or equal to pivot
            // to the left side
            for (int j = low; j < high; j++)
            {
                if (arr[j] <= pivot)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i++;
                }
            }

            // Place pivot in its correct sorted position
            int temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;

            // If pivot is at the required index, return it
            if (i == k)
            {
                return arr[i];
            }
            // Search only the left part
            else if (k < i)
            {
                high = i - 1;
            }
            // Search only the right part
            else
            {
                low = i + 1;
            }
        }

        // Invalid k or no element found
        throw new IllegalArgumentException("Invalid k value");
    }

    public static void main(String[] args)
    {
        int[] arr = {7, 10, 4, 3, 20, 15};

        // Find the 3rd smallest element
        int k = 3;

        if (k < 1 || k > arr.length)
        {
            System.out.println("Invalid k value");
        }
        else
        {
            int result = quickSelect(arr, k);

            System.out.println(
                    k + "rd/nd/th smallest element: " + result
            );
        }
    }
}

