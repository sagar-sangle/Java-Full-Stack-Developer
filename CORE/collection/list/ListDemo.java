/*The List interface represents an ordered collection that allows duplicates. 
  It is implemented by classes like ArrayList, LinkedList, and Vector.
   Lists allow elements to be accessed by their index position. 
  
Declartation : public interface List<E> extends Collection<E>

The List Interface in Java extends the Collection Interface and is a part of java.util package. It is used to store the ordered collections of elements. So in a Java List, you can organize and manage the data sequentially.

Maintained the order of elements in which they are added.
Allows the duplicate elements.
The implementation classes of the List interface are ArrayList, LinkedList, Stack, and Vector.
Can add Null values that depend on the implementation.
The List interface offers methods to access elements by their index and includes the listIterator() method, which returns a ListIterator.
Using ListIterator, we can traverse the list in both forward and backward directions.
  */

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();

        items.add("bag");
        items.add("bagpack");
        items.add("console");
        items.add("pc");
        items.add("toys");

        //maintainted insertion order 
        System.out.println(items);//[bag, bagpack, console, pc, toys]

        // Allows the duplicate elements.
        items.add("toys");
        System.out.println(items);

        // The implementation classes of the List interface are ArrayList, LinkedList, Stack, and Vector.
        List<String> impl1 = new LinkedList<>();
        List<String> impl2 = new Stack<>();
        List<String> impl3 =  new Vector<>();
    // Can add Null values that depend on the implementation.
        items.add(null);
        items.add(null);
        System.out.println(items);
    // The List interface offers methods to access elements by their index and includes the listIterator() method, which returns a ListIterator.
    ListIterator iterator = items.listIterator();
    int i=0;
        while (iterator.hasNext()) {
            
            System.out.println("item "+i+++"is :"+iterator.next());
        }
        // Using ListIterator, we can traverse the list in both forward and backward directions.
        


        
        

        



    }
    
}
/*AbstractList, CopyOnWriteArrayList, and the AbstractSequentialList are the classes that implement the List interface.
 A separate functionality is implemented in each of the mentioned classes. They are as follows:

AbstractList: This class is used to implement an unmodifiable list, for which one needs to only extend this AbstractList
 Class and implement only the get() and the size() methods.

CopyOnWriteArrayList: This class implements the list interface. It is an enhanced version of ArrayList in which all the 
modifications(add, set, remove, etc.) are implemented by making a fresh copy of the list.

AbstractSequentialList: This class implements the Collection interface and the AbstractCollection class. 
This class is used to implement an unmodifiable list, for which one needs to only extend this AbstractList Class and 
implement only the get() and the size() methods */