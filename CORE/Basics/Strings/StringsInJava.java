package CORE.Basics.Strings;



/*
 In Java, strings are sequences of characters used to store and manipulate text. 
 Strings are not a primitive data type but are instead objects of the String class in the java.lang package.
  Strings in Java are immutable, meaning once a string is created, it cannot be changed.

  why string are immuatable ? 
  Strings are widely used for sensitive data, such as usernames, passwords, and URLs.
    If strings were mutable, someone could alter the contents of a string object referenced in multiple places, causing unintended behavior or security vulnerabilities.

Key Features of Strings:
Immutability: Modifying a string creates a new object instead of altering the original one.
Convenient Methods: The String class provides many methods for manipulation, such as length(), substring(), replace(), toLowerCase(), and toUpperCase().
Creation:
Using string literals:
java
Copy code
String str = "Hello, World!";
Using the new keyword:
java
Copy code
String str = new String("Hello, World!");

differnce in this two : 
Aspect	String Literal	                            String with new Keyword
Memory  Location Allocated in the String Pool.	    Allocated in the Heap Memory.
Reuse	Reuses the object if it already exists.	    Always creates a new object.
Performance	Faster (uses less memory).	            Slower (creates a new object each time).
Comparison (==)	Points to the same object in the pool.	Points to different objects in memory.
Best Use Case	When the string value is constant or reused often.	When you explicitly want a new object.

 */

public class StringsInJava {

    public static void main(String[] args) {
        String firstname,lastname;
        firstname="sagar";
        lastname="sagar";

        System.out.println(firstname.equals(lastname));//true //beacuse checks content
        System.out.println(firstname==lastname);//true :beause both reference to same in SCP

        String FName = new String("sagar");
        String LName = new String("sagar");
        
        System.out.println(FName.equals(LName));//true //beacuse checks content
        System.out.println(FName==LName);//true :beause both reference to same in SCP


        //Stirng methods :
        String fullname = FName.concat(LName);
        System.out.println(fullname);

        
        
    }
    
}