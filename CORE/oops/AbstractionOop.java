
abstract class Animal{

    String name;

    Animal(String name){
        this.name=name;
        System.out.println("abstract class constructor called.");
    }

    public abstract void sound(String name);

    public void eat(String name){
        System.out.println(this.name+" eats food");
    }

}

class Dog extends Animal{

    String name;

    Dog(String name){
        super(name);
        System.out.println("Derived class constructor called.");
    }



    @Override
    public void sound(String name) {
      System.out.println(this.name+": bhow bhow !");
    }
    
}

public class AbstractionOop {
    public static void main(String[] args) {
        
Dog dog = new Dog("Labrador");
dog.eat(dog.name);
dog.sound(dog.name);// null : bhow bhow beacuse abstract class is called first and name is not initlized .

    }
}


/*
 What is Abstraction in Java?
In Java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.

Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.

Abstraction Real-Life Example:
Consider a real-life example of a man driving a car. The man only knows that pressing the accelerator will increase the speed of a car or applying brakes will stop the car, but he does not know how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of the accelerator, brakes, etc. in the car. This is what abstraction is. 

Abstract class : 

Why abstract classes have a constructor? 

The main purpose of the constructor is to initialize the newly created object. 
In abstract class, we have an instance variable, abstract methods, and non-abstract methods.
 We need to initialize the non-abstract methods and instance variables, therefore abstract classes have a constructor.
Also, even if we don’t provide any constructor the compiler will add default constructor in an abstract class.
An abstract class can be inherited by any number of sub-classes, thus functionality of constructor present in abstract class can be used by them.
The constructor inside the abstract class can only be called during constructor chaining
 i.e. when we create an instance of sub-classes. This is also one of the reasons abstract class can have a constructor.



Why Java Interfaces Cannot Have Constructor But Abstract Classes Can Have?

A Constructor is a special member function used to initialize the newly created object. 
It is automatically called when an object of a class is created.


Why interfaces can not have the constructor?

An Interface is a complete abstraction of class. All data members present in the interface are by default public, static, and final. All the static final fields should be assigned values at the time of declaration, otherwise it will throw compilation error saying “variable variable_Name not initialized in default constructor”.
The methods inside the interface are by default public abstract which means the method implementation cannot be provided by the interface itself, it has to be provided by the implementing class. Therefore, no need of having a constructor inside the interface.
A constructor is used to initializing non-static data members and as there are no non-static data members in the interface, there is no need of constructor
Methods present in the interface are only declared not defined, As there is no implementation of methods, there is no need of making objects for calling methods in the interface and thus no point of having constructor in it.
If we try to create a constructor inside the interface, the compiler will give a compile-time error.
 */