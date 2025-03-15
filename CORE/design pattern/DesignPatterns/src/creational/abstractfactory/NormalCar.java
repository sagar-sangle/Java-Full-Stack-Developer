package creational.abstractfactory;

public class NormalCar implements  Car{
    @Override
    public void assemble() {
        System.out.println("assembling a normal car");
    }
}
