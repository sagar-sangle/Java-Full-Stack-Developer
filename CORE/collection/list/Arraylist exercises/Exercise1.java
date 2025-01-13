

/* Write a Java program to create an array list, add some colors (strings) and print out the collection.
Click me to see the solution

Write a Java program to iterate through all elements in an array list. */

import java.util.*;

public class Exercise1 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("black");
        colors.add("blue");
        colors.add("magenta");
        colors.add("yellow");

        //print collection
        //System.out.println(colors);

        //iterate 
        // Iterator itr = colors.iterator();

        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        //enter element in first position
        colors.addFirst("pink");
        for (String str: colors) {
            System.out.println(str);
            
        }

        //retirve at specified index
        int index = 5;
        System.out.println("element at  index "+index+" is :"+colors.get(index));

        //update an element
        colors.set(0, "light pink");
        System.out.println("updated list"+colors);
        
        //remove 3rd elemnt 
        colors.remove(3);

        //search for yellow
        
        System.out.println("magenta is at +"+colors.indexOf("magenta"));

        //copy one arraylist into another 
        //ArrayList copyColors = (ArrayList) colors.clone(); or 
        ArrayList copycolors= new ArrayList<>(5);
        Collections.copy(copycolors, colors);
        System.out.println("coped array"+colors);//copied array

    }   

    


    
}
