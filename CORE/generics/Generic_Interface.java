

interface Print<T>{

    void print(T type);

}


class MyNumber<T> extends Number implements Print<T> {

        T value;

        

    public MyNumber(T value) {
            this.value = value;
        }

        


    @Override
    public void print(T type) {
        System.out.println("My number : "+type);
    }




    public T getValue() {
        return value;
    }




    @Override
    public int intValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'intValue'");
    }




    @Override
    public long longValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'longValue'");
    }




    @Override
    public float floatValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'floatValue'");
    }




    @Override
    public double doubleValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doubleValue'");
    }


    

   
}

class SagarNumber<T extends Number & Print>{

    T item;

    public SagarNumber(T value) {
        this.item = value;
    }

    void print(T value){
            item.print(value);
    }


    
        
}


public class Generic_Interface {

   public static void main(String[] args) {
     MyNumber<Integer> num = new MyNumber<>(101);

    SagarNumber<MyNumber> mynum = new SagarNumber<>(num);
    
    mynum.print(num);
   }

    
}
