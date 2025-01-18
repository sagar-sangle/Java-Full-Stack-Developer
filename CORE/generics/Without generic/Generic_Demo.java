class Box{


    private Object value;

    

    public Box(Object value) {
        this.value = value;
    }



    public Object getValue(){
        return this.value;
    }


}


class Generic_Demo{
    public static void main(String[] args) {
        
        Box box = new Box(10);//beacuse we are using object class which is super class or all clasess

        int a = (int) box.getValue();//manual typecasting
        System.out.println(a);

        Box box1 = new Box("sagar");
        //below we have to manually check
        String str = (String) box.getValue(); //here if mistakly we try to put int into string it does not give error at the compile time
        System.out.println(str);
        //hence generic were introduced



    }
}