
class Box<T>{

    T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    

}

public class Generic_Demo {
    public static void main(String[] args) {
        
        //here we do not need to type cast
        //no manual checking
        Box<Integer> box = new Box(10);
        //String str =box.getValue();//gives compile type safty

        int number = box.getValue();
        System.out.println(number);



    }
}
