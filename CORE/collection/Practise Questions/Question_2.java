 import java.util.*;

 //merge two collection and remove duplicates 
public class Question_2 {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(3);
        numbers.add(4);
        numbers.add(15);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(6);
        numbers2.add(3);
        numbers2.add(3);
        numbers2.add(15);

        
        Set<Integer> numberse = new HashSet<>();
        numberse.addAll(numbers);
        numberse.addAll(numbers2);

        //remove duplicates
        System.out.println(numberse);


        





        

    }
}
