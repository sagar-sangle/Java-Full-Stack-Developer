/*Composition 
Composition is a core concept in object-oriented programming that refers to the relationship “part-of” between classes. 
It is a stronger form of association in which the contained objects’ lifecycle is strongly associated with the container object’s 
lifecycle. The understanding of composition is crucial in the design of complex systems where objects of the system are composed of
other objects.

Composition is a type of association meaning one class “contains” another. This association can be said to be a “part-of” relationship and would denote that the contained object is strongly connected with the containing object, the whole. The parts cannot be without the whole.

Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.  

It represents part-of relationship.
In composition, both entities are dependent on each other.
When there is a composition between two entities, the composed object cannot exist without the other entity. */
import java.io.*;
import java.util.*;

// Class 1
// Department class
class Department {

    // Attributes of Department
    public String departmentName;

    // Constructor of Department class
    public Department(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }
}

// Class 2
// Company class
class Company {

    // Reference to refer to list of books
    private String companyName;
    private List<Department> departments;

    // Constructor of Company class
    public Company(String companyName)
    {
        this.companyName = companyName;
        this.departments = new ArrayList<Department>();
    }

    // Method
    // to add new Department to the Company
    public void addDepartment(Department department)
    {
        departments.add(department);
    }

    public List<Department> getDepartments()
    {
        return new ArrayList<>(departments);
    }

    // Method
    // to get total number of Departments in the Company
    public int getTotalDepartments()
    {
        return departments.size();
    }
}

// Class 3
// Main class
class Compositon {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating a Company object
        Company techCompany = new Company("Tech Corp");

        techCompany.addDepartment(new Department("Engineering"));
        techCompany.addDepartment(new Department("Operations"));
        techCompany.addDepartment(new Department("Human Resources"));
        techCompany.addDepartment(new Department("Finance"));

        int d = techCompany.getTotalDepartments();
        System.out.println("Total Departments: " + d);

        System.out.println("Department names: ");
        for (Department dept : techCompany.getDepartments()) {
            System.out.println("- " + dept.getDepartmentName());
        }
    }
}