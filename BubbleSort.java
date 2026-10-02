// This class sorts an array using the Bubble Sort algorithm
public class BubbleSort
{
    // This method sorts the given array in ascending order
    public static void sort(int[] arr)
    {
        // Stores the total number of elements in the array
        int n = arr.length;

        // Outer loop controls the number of passes.
        // We need at most n - 1 passes to sort the array.
        for (int i = 0; i < n - 1; i++)
        {
            // Inner loop compares adjacent elements.
            // After every pass, the largest unsorted element
            // reaches its correct position at the end.
            // So, we reduce the comparisons by i each time.
            for (int j = 0; j < n - i - 1; j++)
            {
                // If the current element is greater than
                // the next element, they are in the wrong order.
                if (arr[j] > arr[j + 1])
                {
                    // Temporary variable stores the current element
                    // so that its value is not lost during swapping.
                    int temp = arr[j];

                    // Move the next element to the current position
                    arr[j] = arr[j + 1];

                    // Put the stored element into the next position
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Program execution starts from the main method
    public static void main(String[] args)
    {
        // Creates an unsorted array of integers
        int[] data = {5, 1, 4, 2, 8, 12};

        // Calls the sort method to arrange the array in ascending order.
        // The original array is modified directly.
        sort(data);

        // Prints a message before displaying the sorted elements
        System.out.print("Sorted Array: ");

        // Enhanced for loop visits each element in the sorted array
        for (int num : data)
        {
            // Prints each element followed by a space
            System.out.print(num + " ");
        }
    }
}

