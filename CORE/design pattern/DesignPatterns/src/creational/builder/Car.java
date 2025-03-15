package creational.builder;

public class Car {

    private long vID;
   private String wheels;
    private String color;
    private String type;
    private int maxSpeed;

    private Car(CarBuilder builder){
        this.vID=builder.vId;
        this.wheels=builder.wheels;
        this.color=builder.color;
        this.type=builder.type;
        this.maxSpeed=builder.maxSpeed;

    }

    @Override
    public String toString() {
        return "Car{" +
                "vID=" + vID +
                ", wheels='" + wheels + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static class CarBuilder{


        private long vId;
        private String wheels;
        private String color;
        private String type;
        private int maxSpeed;


        CarBuilder(long vId,String wheels,String type){
            this.vId=vId;
            this.wheels=wheels;
            this.type=type;
        }





        public CarBuilder addColor(String color) {
            this.color = color;
            return this;
        }






        public CarBuilder addMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Car build(){
            return new Car(this);
        }


    }


}
