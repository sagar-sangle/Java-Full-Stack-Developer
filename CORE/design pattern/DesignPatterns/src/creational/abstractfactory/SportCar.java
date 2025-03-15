package creational.abstractfactory;

public class SportCar implements  Car{

    @Override
    public void assemble() {
        System.out.println("assembling a sport bike");
    }
}
