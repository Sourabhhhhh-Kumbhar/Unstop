public class FindingSmallestElement
{
    public static int findSmallestElement(int[] arr)
    {
        int smallest = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args)
    {
        int[] arr = {12,54,21,7,87,39};
        System.out.println("Smallest Element: " + findSmallestElement(arr));
    }
}
