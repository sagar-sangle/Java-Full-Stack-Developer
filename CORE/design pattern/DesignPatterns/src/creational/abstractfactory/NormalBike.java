package creational.abstractfactory;

public class NormalBike implements Bike{
    @Override
    public void assemble() {
        System.out.println("assembling a normal bike");
    }
}
