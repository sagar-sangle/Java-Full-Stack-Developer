/*Aggregation : HAS-A
Aggregation is a relationship that comes under object-oriented programming, classifying an instance of a class as “has a.” 
It’s a form of association with weaker relationship strength, whereby the lifetime of the contained object (part) is not controlled
 based on the lifetime of the container object (whole). Concepts of aggregation are quite important for developing modular 
 and reusable software components.

Aggregation is a type of association that represents a relationship where one class is a collection or container of another class. 
It depicts a “has-a” relationship, where the container object can exist independently of its contents, and the contained objects
 can exist independently of the container.

It is a special form of Association where:  

It represents Has-A’s relationship.
It is a unidirectional association i.e. a one-way relationship. For example, a department can have students but vice versa is not 
possible and thus unidirectional in nature.
In Aggregation, both entries can survive individually which means ending one entity will not affect the other entity. */


// Class 1
// Student class

import java.util.ArrayList;
import java.util.List;

class Student {

    // Attributes of Student
    private String studentName;
    private int studentId;

    // Constructor of Student class
    public Student(String studentName, int studentId)
    {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public int getstudentId() { 
      return studentId; 
    }

    public String getstudentName() {
      return studentName; 
    }
}

// Class 2
// Department class 
// Department class contains list of Students
class Department {

    // Attributes of Department class
    private String deptName;
    private List<Student> students;

    // Constructor of Department class
    public Department(String deptName, List<Student> students)
    {
        this.deptName = deptName;
        this.students = students;
    }

    public List<Student> getStudents() {
      return students; 
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }
}

// Class 3
// Institute class
// Institute class contains the list of Departments
class Institute {

    // Attributes of Institute
    private String instituteName;
    private List<Department> departments;

    // Constructor of Institute class
    public Institute(String instituteName,
                     List<Department> departments)
    {
        // This keyword refers to current instance itself
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public void addDepartment(Department department)
    {
        departments.add(department);
    }

    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<Student> students = null;

        for (Department dept : departments) {
            students = dept.getStudents();

            for (Student s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}


public class Aggregation {

    public static void main(String[] args) {

          // Creating independent Student objects
          Student s1 = new Student("Parul", 1);
          Student s2 = new Student("Sachin", 2);
          Student s3 = new Student("Priya", 1);
          Student s4 = new Student("Rahul", 2);
  
          // Creating an list of CSE Students
          List<Student> cse_students = new ArrayList<Student>();
          cse_students.add(s1);
          cse_students.add(s2);
  
          // Creating an initial list of EE Students
          List<Student> ee_students = new ArrayList<Student>();
          ee_students.add(s3);
          ee_students.add(s4);
  
          // Creating Department object with a Students list
          // using Aggregation (Department "has" students)
          Department CSE = new Department("CSE", cse_students);
          Department EE = new Department("EE", ee_students);
  
          // Creating an initial list of Departments
          List<Department> departments = new ArrayList<Department>();
          departments.add(CSE);
          departments.add(EE);
  
          // Creating an Institute object with Departments list
          // using Aggregation (Institute "has" Departments)
          Institute institute = new Institute("BITS", departments);
  
          // Display message for better readability
          System.out.print("Total students in institute: ");
  
          // Calling method to get total number of students
          // in the institute and printing on console
          System.out.print(
              institute.getTotalStudentsInInstitute());
        
    }
    
}
