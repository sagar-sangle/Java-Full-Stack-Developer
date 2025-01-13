package CORE.collection.Map;

import java.util.TreeMap;

/*
 * Tree Map is an Implementation class of Map interface it is present in util package Tree Map Internally uses Red Black tree data sturcture 
 * tree map Implements Navigable and SortedMap Interfacses 
 * 
 * Properties : 
 * treemap does not follows insertion order 
 * key must be unique not a single null is allowed
 * value can be duplciate
 * treemap follow sroting order with respect to keys
 * stores data in key value pair but not in indexig 
 * can store both homo and hetergoenis type of data in case of hetero we need to use comaprator
 * tree map is not synchronized
 * 
 * 
 * Red_black tree : its root node is alaways black 
  1)every node is black or red
  2)null node is alaways black
  3)if node is red its childetn are black
  4)for every path node of black are alawyas equal

 * 
 */

public class TreeMap_Demo {

    public static void main(String[] args) {
        TreeMap map = new TreeMap<>();
        map.put(101,"Sagar");
        map.put(109,"Sagar");
        map.put(106,"Sagar");
        map.put(105,"Sagar");
        map.put(104,"Sagar");
        map.put(107,"Sagar");

        System.out.println(map);

    }
    
}
