// Imports utility classes, including Set and HashSet
import java.util.*;

public class CountingDistinctElements
{
    // This method counts the number of unique elements in an array
    public static int countDistinct(int[] arr)
    {
        // Creates a HashSet to store unique integer values.
        // A Set does not allow duplicate elements.
        // HashSet provides efficient insertion and lookup on average.
        Set<Integer> set = new HashSet<>();

        // Enhanced for loop visits each element in the array
        for (int num : arr)
        {
            // Adds the current number to the set.
            // If the number already exists, it is not added again.
            set.add(num);
        }

        // Returns the number of unique elements stored in the set.
        // The size() method gives the total number of elements.
        return set.size();
    }

    // Program execution starts from the main method
    public static void main(String[] args)
    {
        // Creates an array containing some duplicate values
        int[] arr = {1, 2, 3, 4, 2, 1, 5, 3, 7, 8, 9};

        // Calls countDistinct() and prints the returned result
        System.out.println(
                "Number of Distinct Elements: " + countDistinct(arr)
        );
    }
}

