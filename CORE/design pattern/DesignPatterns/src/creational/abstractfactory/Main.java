package creational.abstractfactory;

public class Main {

    public static void main(String[] args) {

        NormalVehicleFactory normalVehicleFactory = new NormalVehicleFactory();
        Bike bike = normalVehicleFactory.CreateBike();
        Car car = normalVehicleFactory.createCar();

        bike.assemble();
        car.assemble();

        /*
        ✅ Benefits of Abstract Factory Pattern
🔹 Encapsulates object creation logic – The client does not need to know concrete class names.
🔹 Supports multiple families of products – Easily switch between different product families.
🔹 Ensures consistency – Only compatible products are created together.
🔹 Follows Dependency Inversion Principle – Clients depend on abstractions, not concrete classes.


         */

    }
}
