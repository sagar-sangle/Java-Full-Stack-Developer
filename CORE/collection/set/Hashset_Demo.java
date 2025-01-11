/*HashSet:

HashSet class which is implemented in the collection framework is an inherent implementation of the hash table data structure. 
The objects that we insert into the HashSet do not guarantee to be inserted in the same order. The objects are inserted based on their 
hashcode. This class also allows the insertion of NULL elements.  

Backed by a hash table.
Does not store duplicate Elements
hashset can store heterogenous elements 
Does not guarantee the order of elements meaning does not maintain insertion order 
Offers constant-time performance for basic operations (add, remove, contains).
Allows one null element. 
hashset are non synchronized data structure  */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset_Demo {

    public static void main(String[] args) {

                // Creating object of Set of type String
        Set<String> h = new HashSet<String>();

        // Adding elements into the HashSet
        // using add() method

        // Custom input elements
        h.add("India");
        h.add("Australia");
        h.add("South Africa");

        // Adding the duplicate element
        h.add("India");

        // Displaying the HashSet
        System.out.println(h);

        // Removing items from HashSet
        // using remove() method
        h.remove("Australia");
        System.out.println("Set after removing "
                           + "Australia:" + h);

        // Iterating over hash set items
        System.out.println("Iterating over set:");

        // Iterating through iterators
        Iterator<String> i = h.iterator();

        // It holds true till there is a single element
        // remaining in the object
        while (i.hasNext())

            System.out.println(i.next());
    }
        
    }
    
/*When to Use HashSet

Fast Operations: Use HashSet when you need fast performance for adding, removing, and checking elements.

No Duplicates: Ideal for scenarios where you need to ensure that elements are unique.

Unordered Collection: Suitable when the order of elements does not matter.

Summary
HashSet: A widely used implementation of the Set interface.
Performance: Constant-time complexity for basic operations.
Features: Allows null, does not allow duplicates, and does not guarantee order.
Usage: Best for cases where you need fast access and uniqueness of elements. */
