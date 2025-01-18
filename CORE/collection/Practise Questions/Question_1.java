/*Write a program to sort a list of integers in ascending and descending order.
Create a program to merge two collections and remove duplicates.
Implement a program to find the maximum and minimum elements in a collection.
Write a program to compare two collections for equality. */

import java.util.*;

public class Question_1 {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(3);
        numbers.add(4);
        numbers.add(15);

        

        //sort in asceding order 
        // System.out.println("Before Sorting"+numbers);
        // Collections.sort(numbers);
        // System.out.println("after sorting "+numbers);

        //sort in descending :
        // Collections.reverse(numbers);
        // System.out.println("sorted desceding :"+numbers);

        Comparator<Integer> com = (o1, o2) -> (o1<o2)?1:-1; 
        Collections.sort(numbers,com);
        System.out.println(numbers);


    }
}
