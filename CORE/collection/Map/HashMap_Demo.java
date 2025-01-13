package CORE.collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 
 */
public class HashMap_Demo {
    public static void main(String[] args) {

        Map<Integer,String> employees = new HashMap<>();
        
         //adding
         employees.put(null,"ash");
         employees.put(102,null);
         employees.put(103,null);
         employees.put(101,"sagar");

         //iteration over elements 
        for(Map.Entry<Integer,String> e  : employees.entrySet()) 
            System.out.println("key :"+e.getKey()
                                +"value:"+e.getValue());
                
        //or
          Set<Map.Entry<Integer,String>> set = employees.entrySet();  
          Iterator itr =set.iterator();   
          while (itr.hasNext()) {

            Map.Entry<Integer,String> map=(Map.Entry<Integer,String>)itr.next();
            System.out.println("key is :"+map.getKey()
                            +"value is :"+map.getValue());
            
          }  

          


    }
}
