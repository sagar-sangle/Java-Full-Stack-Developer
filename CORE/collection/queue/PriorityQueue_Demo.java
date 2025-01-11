/*The PriorityQueue class in Java is part of the java.util package. It is known that a Queue follows the FIFO(First-In-First-Out) Algorithm, but the elements of the Queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.

The PriorityQueue is based on the Priority Heap.
The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.  
No Null Elements are available in PriorityQueue it will throw NullPointerException in such a case.
Size of the Priority Queue is dynamic , means will increase or decrease as required. */

package CORE.collection.queue;

public class PriorityQueue_Demo {
    
    public static void main(String[] args) {
        
    }
}
/*A few important points on Priority Queue are as follows: 

PriorityQueue doesn’t permit null.
We can’t create a PriorityQueue of Objects that are non-comparable
PriorityQueue are unbound queues.
The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for the least value, the head is one of those elements — ties are broken arbitrarily.
Since PriorityQueue is not thread-safe, java provides PriorityBlockingQueue class that implements the BlockingQueue interface to use in a java multithreading environment.
The queue retrieval operations poll,  remove,  peek, and element access the element at the head of the queue.
It provides O(log(n)) time for add and poll methods.
It inherits methods from AbstractQueue, AbstractCollection, Collection, and Object class. */