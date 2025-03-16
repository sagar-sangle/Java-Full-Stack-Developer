package creational.abstractfactory;

public class NormalVehicleFactory implements VehicleFactory{
    @Override
    public Bike CreateBike() {
        return new NormalBike();
    }

    @Override
    public Car createCar() {
        return new NormalCar();
    }
}
