package creational.factory;

public class main {

    public static void main(String[] args) {


        Vehicle v = VehicleFactory.getVehicle("bike");
        v.getType("vehicle");

    }
}
