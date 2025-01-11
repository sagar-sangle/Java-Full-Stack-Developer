/*Collections: Collections is a utility class present in java.util package. 
It defines several utility methods like sorting and searching which is used to operate on collection. 
It has all static methods. These methods provide much-needed convenience to developers, allowing them to effectively
 work with Collection Framework. For example, It has a method sort() to sort the collection elements according 
 to default sorting order, and it has a method min(), and max() to find the minimum and maximum value respectively
  in the collection elements. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_Demo {

    public static void main(String[] args) {
        
        //Collections c = new Collections();//canot create construcotr as it is private 

        List<String> el = new ArrayList<>();

        el.add("shoes");
        el.add("toys");
        el.add("ab");
        el.add("abc");
        el.add("S");

        //adding more elements using collections class

        Collections.addAll(el,"bags","clothes","chappal");
        System.out.println(el);//[shoes, toys, bags, clothes, chappal]

        //sorting 

        //Collections.sort(el);;//ascending
        //System.out.println(el);//[bags, chappal, clothes, shoes, toys]

        Collections.sort(el,(e1,e2)->e1.compareTo(e2));
        System.out.println("after sorting with comaparator");
        System.out.println(el);
        
        //revrese sorting using comparator 
        Collections.sort(el,(o1,o2)->o2.compareTo(o1));
        System.out.println("after revrese sorting with comaparator");
        System.out.println(el);

        //sorting using length of strings
                Comparator<String> comparator  = (name1,name2)->{

                    int len = Integer.compare(name1.length(), name2.length());//if less than name 2 then -1
                    
                    if(len<0){
                        return -1;
                    }
                    
                    return 1;
                };

                Collections.sort(el,comparator);
                System.out.println("after  sorting by length");
                System.out.println(el);

            
        

        



    }
    
}
