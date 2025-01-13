

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();
        c.add("bat");
        c.add("bat");
        c.add("bat");

        System.out.println(c);

        //remove 
        c.remove("bat");

        //etc

        
        
    }
    
}
/*interface Collection<E>
E specifies the type of objects that the collection 
Collection extends the Iterable interface.
Iterating through the list cane be done through the iteratable interface. 
Methods in collection interface

add
boolean add(E obj )
adds obj to the invoking collection.
Returns true if obj was added to the collection.
Returns false if obj is already a member of the collection and the 
collection does not allow duplicates.


addAll
boolean addAll(Collection<? extends E> c )
Adds all the elements of c to the invoking collection.
Returns true if the operation succeeded
(i.e., the elements were added). Otherwise, returns false 

contains
boolean contains(Object obj )
Returns true if obj is an element of the invoking collection.
Otherwise, returns false.


containsAll
boolean containsAll(Collection<?> c )
Returns true if the invoking collection contains all elements of c.
Otherwise, returns false.

equals
boolean equals(Object obj )
Returns true if the invoking collection and obj are equal.
Otherwise, returns false.

hashCode
int hashCode( ) Returns the hash code for the invoking collection.

isEmpty
boolean isEmpty( )
Returns true if the invoking collection is empty.
Otherwise, returns false.

iterator
Iterator<E> iterator( ) Returns an iterator for the invoking collection*/