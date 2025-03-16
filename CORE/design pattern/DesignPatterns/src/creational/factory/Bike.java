package creational.factory;

public class Bike implements Vehicle{
    @Override
    public void getType(String type) {
        System.out.println("bike");
    }
}
