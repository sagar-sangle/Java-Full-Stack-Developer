package creational.factory;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicle){

       return  (vehicle.equalsIgnoreCase("car"))?new Car():new Bike();

    }

}
