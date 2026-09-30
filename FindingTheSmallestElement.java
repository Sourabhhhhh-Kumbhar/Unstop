public class FindingTheSmallestElement
{
    public static void main(String[] args)
    {
        int[] arr = {5,2,8,1,9,3,6};
        int smallest = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest Element: " + smallest);
    }
}
