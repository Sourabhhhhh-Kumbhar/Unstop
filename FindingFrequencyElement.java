import java.util.*;

public class FindingFrequencyElement
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,2,3,3,3,3,3,3};
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : arr)
        {
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        System.out.println(freq);
    }
}
