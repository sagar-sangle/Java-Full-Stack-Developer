import java.util.concurrent.CountDownLatch;

class RacerCar implements Runnable {
    private String name;
    private CountDownLatch latch;

    public RacerCar(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(name + " is getting ready to race...");
        try {
            Thread.sleep(3000); // Simulating car preparation
            System.out.println(name + " is ready!");
            latch.await(); // Wait for countdown to finish
            System.out.println(name + " starts racing!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Thread car1 = new Thread(new RacerCar("Car 1", latch));
        Thread car2 = new Thread(new RacerCar("Car 2", latch));
        Thread car3 = new Thread(new RacerCar("Car 3", latch));

        car1.start();
        car2.start();
        car3.start();

        // Race countdown simulation
        for (int i = 3; i > 0; i--) {
            System.out.println("Countdown: " + i);
            Thread.sleep(1000);
            latch.countDown(); // Decreasing the count
        }

        System.out.println("GO! The race has started!");
    }
}
