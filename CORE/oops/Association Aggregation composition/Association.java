/*Association : USES-A
Association is the cardinal concept in object-oriented programming that describes the relationship between two independent classes.
 Association can be viewed as describing a “uses-a” relationship where an object uses, or in any way interacts with, another object.
Association may be either unidirectional or bidirectional and may exist in several forms, such as one-to-one, one-to-many, many-to-one, 
and many-to-many.

Type of Association
Unidirectional Association:
This association is the one in which one class is aware and associated with another class; the reverse is not true. For example, the Student class can be associated with the LibraryCard class, for the association where the student has a library card; a LibraryCard does not need to ‘know about’ a Student.

Bidirectional Association:
In this type of association, the classes are aware of each other and interact with one another. For example, a Teacher class and a Classroom class may be associated bidirectionally; there would be a teacher assigned to a classroom, and a classroom would know to which teacher it is assigned.*/

import java.util.ArrayList;
import java.util.List;

class Students{

    String name;
    int roll;

    
    public Students(String name, int roll) {
            this.name = name;
            this.roll = roll;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    

}

class Department{

    List<Students> students  = new ArrayList<>();

    String DepartmentName;

    

    public Department(List<Students> st, String departmentName) {
            this.students = st;
        DepartmentName = departmentName;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    

}



public class Association {

    public static void main(String[] args) {

        List<Students> st = new ArrayList<Students>();
        Students sagar = new Students("sagar",1);
        Students ash = new Students("ash",2);
        st.add(sagar);
        st.add(ash);
        

        Department cse = new Department(st, "CSE");//one department have many students one-to-one unidiractionl

        System.out.println(cse.toString());






        
    }
    
}
