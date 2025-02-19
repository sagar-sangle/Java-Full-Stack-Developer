import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    AtomicInteger count = new AtomicInteger(0);

    void increment() {
        count.incrementAndGet(); // Atomic operation
    }
}

class Volatile {
    static volatile boolean flag = false; // Ensures visibility across threads
}

class ReaderThread extends Thread {
    public void run() {
        while (!Volatile.flag) {
            // Busy-waiting, but won't get stuck because volatile ensures visibility
        }
        System.out.println("Flag updated!");
    }
}

public class VolatileAndAtomicDemo {
    public static void main(String[] args) throws InterruptedException {
        // Volatile demonstration
        ReaderThread reader = new ReaderThread();
        reader.start();

        Thread.sleep(1000);
        Volatile.flag = true; // Guaranteed to be visible to the reader thread
        System.out.println("Flag set to true");

        // Atomic demonstration
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count.get()); // Always 2000
    }
}
