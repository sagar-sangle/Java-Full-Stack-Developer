/*A Queue in Java is a collection that represents a sequence of elements that are processed in a specific order. 
The primary purpose of a queue is to handle elements in a First-In-First-Out (FIFO) manner, meaning that the first element added to
 the queue will be the first one to be removed. Queues are part of the Java Collections Framework and are used in various applications,
  including task scheduling, buffering, and managing resources. 

  Charectserstics
No Null Elements: Most implementations like PriorityQueue do not allow null elements.
Implementation Classes: LinkedList , PriorityQueue, ArrayDeque, ConcurrentLinkedQueue (for thread-safe operations).
Use Cases: Commonly used for Task scheduling, Message passing, and Buffer management in applications.
Iteration: Supports iterating through elements. The order of iteration depends on the implementation.*/
package CORE.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.offer("Date"); // Using offer method

        // Displaying the Queue
        System.out.println("Queue: " + queue);

        // Checking the size
        System.out.println("Size of Queue: " + queue.size());

        // Removing elements
        String removed = queue.remove(); // Removes "Apple"
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after removal: " + queue);

        // Peeking at the head of the queue
        String head = queue.peek(); // Retrieves "Banana"
        System.out.println("Head of the Queue: " + head);

        // Iterating through the Queue
        System.out.println("Iterating through Queue:");
        for (String fruit : queue) {
            System.out.println(fruit);
        }

        // Clearing the Queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}

/*scheduling, buffering, and managing resources.

Key Features of Queue
FIFO Order:

Elements are added to the end of the queue and removed from the front. This ensures that the order of processing follows the sequence in which elements were added.
Dynamic Size:

Queues can grow and shrink dynamically as elements are added and removed.
Null Elements:

Depending on the specific implementation, some queue types may or may not allow null elements.
Blocking Operations:

Some queue implementations (e.g., BlockingQueue) support blocking operations, which can be useful in concurrent programming. */