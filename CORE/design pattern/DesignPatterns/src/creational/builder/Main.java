/*
✅ What is the Builder Pattern?
The Builder Pattern is used to construct complex objects step-by-step while keeping the creation process separate from the object
 itself making it a final class for immutabilty.

✔ Solves the problem of telescoping constructors (many constructor overloads).
✔ Makes object creation readable and maintainable.
✔ Allows step-by-step object creation.
✔ Ensures immutability by creating objects in a controlled manner.

 */

package creational.builder;

public class Main {

    public static void main(String[] args) {

        Car MyCar = new Car.CarBuilder(101, "gulf", "sport")
                .addColor("white")
                .addMaxSpeed(300)
                .build();

        System.out.println(MyCar);


    }
}
