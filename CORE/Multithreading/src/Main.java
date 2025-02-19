
import java.util.concurrent.Callable;

@FunctionalInterface
interface demo{

    public int demom(int a,int b);

}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        demo d = Integer::sum;
        int demom = d.demom(10, 20);


    }
}