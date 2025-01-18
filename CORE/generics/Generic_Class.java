class Test<T>{

    T obj;
    Test(T obj){
        this.obj = obj;
    }

    public void show(){

            System.out.println("the value of T :"+obj);
    }

}




class Generic_Class{
    public static void main(String[] args) {
        
        Test<String> test = new Test<>("sagar");
        test.show();
        

    }
}