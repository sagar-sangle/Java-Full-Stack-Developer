/*The Set Interface is present in java.util package and extends the Collection interface.
 It is an unordered collection of objects in which duplicate values cannot be stored.
  It is an interface that implements the mathematical set. 
  This interface adds a feature that restricts the insertion of the duplicate elements.

No Specific Order: Does not maintain any specific order of elements (Exceptions: LinkedHashSet and TreeSet).
Allows One Null Element: Most Set implementations allow a single null element.
Implementation Classes: HashSet , LinkedHashSet and TreeSet.
Thread-Safe Alternatives: For thread-safe operations, use ConcurrentSkipListSet or wrap a set using Collections.synchronizedSet(). */

import java.util.*;

public class Set_Demo {
    public static void main(String[] args) {
        
        //using set we can perform all mathematical operation such as intersection union and diff
        Set<Integer> set1 = new HashSet<>();
        Collection<Integer> number = Arrays.asList(1,2,3,4,5,5,67,8);
        set1.addAll(new ArrayList<Integer>(number));

        Set<Integer> set2 = new HashSet<>();
        Collection<Integer> number2 = Arrays.asList(9,8,0,1,2);
        set2.addAll(new ArrayList<Integer>(number2));

        //union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union is : "+union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection is : "+intersection);
        
        Set<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println("differance is : "+diff);







    }
}
