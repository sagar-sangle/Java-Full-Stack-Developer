public class Deque_Demo {
    
    public static void main(String[] args) {
        
    }
}
/*2. Deque (Double-Ended Queue)
Purpose
A linear collection that allows elements to be inserted and removed from both ends, supporting both FIFO (queue) and LIFO (stack)
 operations.

Package
Part of the java.util package.

Key Characteristics

Extends the Queue interface.
Supports insertion, removal, and inspection of elements at both ends.
Can be used as both a stack (LIFO) and a queue (FIFO).
Permits null elements in some implementations (ArrayDeque does not allow null).
Key Methods

Queue Methods: offerFirst(E e), offerLast(E e), pollFirst(), pollLast(), peekFirst(), peekLast().
Stack Methods: push(E e) (equivalent to addFirst()), pop() (equivalent to removeFirst()).
iterator(): Traverses the deque from front to back.
descendingIterator(): Traverses the deque from back to front.


Implementing Classes

ArrayDeque: Array-based, resizable, does not allow null.
LinkedList: Node-based, allows null.
Usage Scenarios

Implementing both stack and queue functionalities in one structure.
Storing undo/redo operations.
Browser history (back and forward navigation).
Limitations

Not inherently thread-safe. Use ConcurrentLinkedDeque for thread-safe operations.
Special Notes

Introduced in Java 1.6.
Deque is preferred over Stack for LIFO functionality as it is more modern and flexible. */