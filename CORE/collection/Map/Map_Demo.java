package CORE.collection.Map;

import java.util.HashMap;
import java.util.Map;

/*Map : Map in One of the Core Interfaces of java Collection Framework Present in java util package and is used to store key-value pairs. 
Each key must be unique, while values can be duplicated. it doess not inherit collection interface
it is implemented by hashmap tree map linkedhashmap

it does not follow insertion order or any sorting order 
it can store one null value but multile null values

 */

public class Map_Demo {
    public static void main(String[] args) {

        Map<Integer,String> employees = new HashMap<>();

        //allows one null key but can have multiple null values

        //adding
        employees.put(null,"ash");
        employees.put(102,null);
        employees.put(103,null);

        employees.put(101,"sagar");

        System.out.println(employees);

        //removing
        employees.remove(null);
        System.out.println(employees);

        


        
    }
}
