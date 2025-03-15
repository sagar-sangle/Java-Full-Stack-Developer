package creational.abstractfactory;

public class SportBike implements Bike{

    @Override
    public void assemble() {
        System.out.println("assembling a sport bike");
    }
}
