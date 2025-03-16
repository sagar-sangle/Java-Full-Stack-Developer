package creational.factory;

public class Car implements Vehicle{


    @Override
    public void getType(String type) {
        System.out.println("car");
    }
}
