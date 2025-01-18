/*A Hashtable is a data structure that provides an efficient way to store and retrieve data using key-value pairs. 
It is implemented using a hashing mechanism, where a hash function computes an index for a given key, and the value is stored at
 that index in an underlying array.

 1)it does not follow any sorting order
 2)does not allow null key or values
 hashtable retirved values top to bottom 
 3)this is thread safe 
 it uses linked list only even if collision occrus 

 It is similar to HashMap, but is synchronized.
Hashtable stores key/value pair in hash table.
In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.

 
 */
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class HashTable_Demo {
    public static void main(String[] args) {


        // Map<Integer,String> emp = new HashMap<>();
        //in case of hashmap outpul will be inconsistant
        Map<Integer,String> emp = new ConcurrentHashMap<>();


        Runnable r1 = ()->{

            for (int i = 0; i < 100; i++) {
                emp.put(i, "thread 1");
            }
            
        };

        Runnable r2 = ()->{

            for (int i = 100; i < 200; i++) {
                emp.put(i, "thread 2");
            }
            
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

       t1.start();
       t2.start();

       try {
           t2.join();
           t1.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

        System.out.println("size of map is :"+emp.size());


        
    }
}
