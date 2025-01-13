/*A Comparator in Java is an interface used for customizing the sorting order of objects. 
It is part of the java.util package and provides greater flexibility in sorting compared to the Comparable interface. */

package comparator

import java.util.*;



class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " ($" + salary + ")";
    }
}

public class Comparator_Demo {

  public static void main(String[] args) {
    List<Employee> employees = Arrays.asList(
        new Employee("John", 5000),
        new Employee("Jane", 7000),
        new Employee("John", 6000)
    );h

    

    Collections.sort(employees,(Employee e1,Employee e2)->e1.name.compareTo(e2.name));
  }
        


    
}
/*Core Method

int compare(T o1, T o2):
Compares two objects and returns:
negative integer if o1 < o2.
zero if o1 == o2.
positive integer if o1 > o2.

Static Methods (Java 8):

Comparator.comparing(Function keyExtractor):
Creates a comparator based on a key extracted from the objects.
Comparator.reverseOrder():
Returns a comparator that imposes reverse natural ordering.
Comparator.naturalOrder():
Returns a comparator that imposes natural ordering.
Default Methods (Java 8):

thenComparing(Comparator other):
Combines this comparator with another comparator for tie-breaking.
thenComparing(Function keyExtractor):
Adds a secondary sorting order based on the extracted key.
reversed():
Returns a comparator that reverses the order of the current comparator.
*/