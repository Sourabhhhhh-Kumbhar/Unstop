import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoSets
{
    static Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2)
    {
        // Create a copy so the original set1 is not modified
        Set<Integer> result = new HashSet<>(set1);

        // Keep only elements that are present in both sets
        result.retainAll(set2);

        return result;
    }

    public static void main(String[] args)
    {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> intersection = findIntersection(set1, set2);

        System.out.println(intersection);
    }
}