/*The PriorityQueue class in Java is part of the java.util package.
 It is known that a Queue follows the FIFO(First-In-First-Out) Algorithm,
  but the elements of the Queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.

The PriorityQueue is based on the Priority Heap.
The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.  
No Null Elements are available in PriorityQueue it will throw NullPointerException in such a case.
Size of the Priority Queue is dynamic , means will increase or decrease as required. */



import java.util.*;

class Student implements Comparable<Student>{

    int id;
    String name;

    

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    @Override
    public int compareTo(Student s) {

        if(id>s.id)
        return -1;

        if(id<s.id){
            return 1;
        }

        return 0;

        
    }



    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    




}

public class PriorityQueue_Demo {

    
    public static void main(String[] args) {

        PriorityQueue<String> names = new PriorityQueue<>();//it only takes comparable objects as stirng already implemetns comparable 
        names.add("ash");
        names.add("tom");
        names.add("jeryy");
        names.add("a");

        System.out.println("default : "+names);

        //for comaparting with custom classes 
        PriorityQueue<Student> students = new PriorityQueue<>();

        Student[] studs = {new Student(1,"sagar"),new Student(2,"ash"),new Student(3,"jeryy")};
        students.addAll(Arrays.asList(studs));

        System.out.println("students :"+students);//students :[Student [id=3, name=jeryy], Student [id=1, name=sagar], Student [id=2, name=ash]]



        
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
It inherits methods from AbstractQueue, AbstractCollection, Collection, and Object class. 


1. PriorityQueue
Purpose
A specialized queue where elements are processed based on their priority, rather than their insertion order. By default, it uses natural ordering or a custom comparator to determine priority.

Package
Part of the java.util package.

Key Characteristics

Implements the Queue interface.
Elements are ordered either by natural order (for Comparable elements) or by a custom comparator.
Does not permit null elements.
Duplicate elements are allowed.
Does not follow FIFO; instead, the element with the highest priority (lowest value in natural order) is dequeued first.
Key Methods

offer(E e): Inserts the specified element into the priority queue.
poll(): Retrieves and removes the head of the queue (the element with the highest priority).
peek(): Retrieves, but does not remove, the head of the queue.
remove(Object o): Removes a single instance of the specified element, if it exists.
Internal Data Structure

Uses a binary heap for internal representation, typically a min-heap for natural order.
Usage Scenarios

Scheduling tasks based on priority.
Implementing Dijkstra’s algorithm or other graph-related algorithms.
Job/task scheduling systems.
Limitations

Not thread-safe. Use PriorityBlockingQueue for thread-safe implementations.
Not suitable for maintaining strict insertion order or random access.
Special Notes

Introduced in Java 1.5.
Does not guarantee consistent ordering of elements with the same priority.*/