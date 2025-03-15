package creational.abstractfactory;

public class SportVehicleFactoy implements VehicleFactory{
    @Override
    public Bike CreateBike() {
        return new SportBike();
    }

    @Override
    public Car createCar() {
        return new SportCar();
    }
}
