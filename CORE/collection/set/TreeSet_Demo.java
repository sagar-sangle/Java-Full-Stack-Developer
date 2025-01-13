/*
 * TreeSet class which is implemented in the collections framework and implementation of the SortedSet Interface and 
 * SortedSet extends Set Interface. It behaves like a simple set with the exception that it stores elements in a sorted format.
 *  TreeSet uses a tree data structure for storage. Objects are stored in sorted, ascending order. 
 * But we can iterate in descending order using the method TreeSet.descendingIterator(). 
 * 
 * treeset is an implemnetation class of an set inteface which is imlementd navigable interface and navigable interafce extends sorted set interface 
 * by default all the elements oftree set are sorted in ascending order . it does not follow insertion order treeset stores only homgenous types of elements 
 * and it cannot store any duplicate values tree set is non synchornized data structure.
 * 
 * 
 */

import java.util.*;

public class TreeSet_Demo {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        // follows sorting but not insertion
        //can store homogenious data only
        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(20);
        ts.add(50);

        System.out.println(ts);
        
        
        

    }    
}
/*TreeSet is a part of the Java Collections Framework and implements the NavigableSet interface, which extends the SortedSet interface. It is a collection that stores elements in a sorted order and does not allow duplicate elements. Here's a detailed overview of TreeSet.

Key Features of TreeSet
Sorted Order:

TreeSet maintains elements in their natural order or according to a specified comparator. The elements are sorted when they are added.
No Duplicates:

Like all sets, TreeSet does not allow duplicate elements. If you try to add a duplicate, it will not be added.
Performance:

TreeSet provides logarithmic time performance (O(log n)) for basic operations such as add, remove, and contains. This is due to its underlying data structure, which is a red-black tree.
Null Elements:

TreeSet does not allow null elements. Attempting to add a null will result in a NullPointerException.
NavigableSet Interface:

TreeSet implements the NavigableSet interface, which provides methods to navigate through the set (e.g., lower, higher, ceiling, floor).
Not Synchronized:

TreeSet is not synchronized, which means it is not thread-safe. If multiple threads access a TreeSet concurrently, it should be synchronized externally. */
