
interface MyMessage{
    void messsage();
}

interface Operation{
    int add(int a,int b);
}

public class function_method {

    public static void main(String[] args) {
        
       //function : 
       //1.lambda : 

       MyMessage msg = ()->System.out.println("hi this is saagr");
       msg.messsage();



       Operation op = (a,b)->(a+b);
       op.add(10,20);

    }
}