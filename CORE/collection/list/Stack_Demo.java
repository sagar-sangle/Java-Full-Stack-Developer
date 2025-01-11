/*Java Collection framework provides a Stack class that models and implements a Stack data structure. The class is based on the basic principle of LIFO(last-in-first-out). In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek.

The Stack class extends Vector and provides additional functionality specifically for stack operations, such as push, pop, peek, empty, and search.
The Stack class can indeed be referred to as a subclass of Vector, inheriting its methods and properties. */

import java.util.Stack;

public class Stack_Demo {
    
    public static void main(String[] args) {
        
        Stack<String> books = new Stack<>();
        books.add("aTOz Java");
        books.add("Spring Boot : Learn the Framework");
        books.add("Hbernate : learn the fundamentals");

        System.out.println(books);

        System.out.println(books.capacity());
        System.out.println("peek:"+books.peek());
        System.out.println(books.push("data strutcure "));




    }
}
/*The Stack class in Java is a part of the Java Collections Framework and is a subclass of Vector. It represents a last-in, first-out (LIFO) data structure, meaning that the last element added to the stack is the first one to be removed.

Key Features of Stack:
LIFO Behavior: The last element pushed onto the stack is the first one popped off.
Dynamic Size: It can grow and shrink dynamically as elements are added or removed.
Thread Safety: The Stack class is synchronized, making it thread-safe for concurrent access.
Inherits from Vector: It inherits methods from Vector, allowing it to utilize its functionalities

Use Cases for Stack:
Expression Evaluation: Used in parsing expressions (infix, postfix).
Backtracking Algorithms: Helps in solving problems where the last choice made must be undone (e.g., maze solving).
Function Call Management: Keeps track of function calls in programming languages.
Undo Mechanism: Supports the undo feature in applications.
Summary
The Stack class provides a straightforward way to implement a LIFO data structure in Java. It is useful in various scenarios, including algorithm implementation, expression parsing, and more. However, for new implementations, consider using Deque (with ArrayDeque or LinkedList) for stack-like behavior due to performance benefits.

*/