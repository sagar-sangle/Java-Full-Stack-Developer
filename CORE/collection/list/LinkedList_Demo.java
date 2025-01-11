/*Linked List is a part of the Collection framework present in java.util package. 
This class is an implementation of the LinkedList data structure which is a linear data structure where the elements are
 not stored in contiguous locations and every element is a separate object with a data part and address part. 
 The elements are linked using pointers and addresses and each element is known as a node. */

import java.util.LinkedList;

public class LinkedList_Demo {

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();

        // Adding elements to the LinkedList using add() method
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");

        // Printing the LinkedList
        System.out.println(l);

         // Create a LinkedList to store String elements
         LinkedList<String> fruits = new LinkedList<>();

         // Adding elements to the LinkedList
         fruits.add("Apple");             // Adds to the end
         fruits.add("Banana");            // Adds to the end
         fruits.add("Cherry");            // Adds to the end
         System.out.println("Fruits after adding: " + fruits);
 
         // Adding elements at specific positions
         fruits.addFirst("Orange");       // Adds to the beginning
         fruits.addLast("Grapes");        // Adds to the end
         System.out.println("Fruits after adding at specific positions: " + fruits);
 
         // Accessing elements
         String firstFruit = fruits.getFirst(); // Get the first element
         String lastFruit = fruits.getLast();   // Get the last element
         String secondFruit = fruits.get(1);     // Get the element at index 1
         
         System.out.println("First Fruit: " + firstFruit);
         System.out.println("Last Fruit: " + lastFruit);
         System.out.println("Second Fruit: " + secondFruit);
 
         // Removing elements
         fruits.removeFirst(); // Removes the first element (Orange)
         fruits.removeLast();  // Removes the last element (Grapes)
         fruits.remove(1);     // Removes the element at index 1 (Banana)
         System.out.println("Fruits after removals: " + fruits);
 
         // Iterating over elements using a for-each loop
         System.out.println("Iterating over LinkedList:");
         for (String fruit : fruits) {
             System.out.println(fruit);
         }
 
         // Checking if the LinkedList contains a specific element
         if (fruits.contains("Cherry")) {
             System.out.println("The list contains Cherry.");
         } else {
             System.out.println("The list does not contain Cherry.");
         }
 
         // Getting the size of the LinkedList
         int size = fruits.size();
         
         System.out.println("Size of the LinkedList: " + size);
 
         // Clearing the LinkedList
         fruits.clear();
         System.out.println("Fruits after clearing: " + fruits);

         
     }
    }
    /*Advantages of using LinkedList in Java
Dynamic size: As with Vector, the size of a LinkedList can grow or shrink dynamically, so you don’t have to worry about setting an initial size.
Efficient Insertions and Deletions: LinkedList is an efficient data structure for inserting or deleting elements in the middle of the list because you only need to change the links between elements, rather than shifting all elements after the insertion or deletion point.
Flexible Iteration: With a linked list, you can efficiently iterate through the list in either direction, since each element has a reference to both its predecessor and successor elements.
Disadvantages of using LinkedList in Java
Performance: LinkedList has a slower performance than ArrayList when it comes to accessing individual elements. This is because you need to traverse the list to reach the desired element, whereas with ArrayList, you can simply access the desired element using an index.
Memory overhead: LinkedList requires more memory th */
    
