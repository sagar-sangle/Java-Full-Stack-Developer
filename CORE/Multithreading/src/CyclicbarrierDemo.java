import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Runners implements Runnable{


    String name;
    CyclicBarrier barrier;

    public Runners(String name, CyclicBarrier barrier) {
        this.name = name;
        this.barrier = barrier;
    }



    @Override
    public void run() {

        System.out.println(name+" is gettting ready to run");
        try {
            Thread.sleep(2000);
            System.out.println(name+" is ready");
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    }
}



public class CyclicbarrierDemo {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(3,()-> System.out.println("All the racers are ready !"));

        Runners r1 = new Runners("usain bolt",barrier);
        Runners r2 = new Runners("gatling",barrier);
        Runners r3 = new Runners("Thunder",barrier);


        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();



        for (int i = 0; i < 3; i++) {
            System.out.println("countDown : "+i);
            Thread.sleep(1000);

        }

        System.out.println("GO!!");
    }
}
