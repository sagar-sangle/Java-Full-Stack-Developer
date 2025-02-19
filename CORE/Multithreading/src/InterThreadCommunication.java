class SharedResource {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int data) {
        while (hasData) {  // If item is already available, wait
            try {
                wait();  // Release lock and wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.data = data;
        hasData = true;
        System.out.println("Produced: " + data);

        notify();  // Notify consumer thread that item is available
    }

    public synchronized void consume() {
        while (!hasData) {  // If no item is available, wait
            try {
                wait();  // Release lock and wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notify();  // Notify producer thread that item is consumed
    }
}

class Producer implements Runnable {
    private final SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException exception){//simulating work

            }
        }
    }
}

class Consumer implements Runnable {
    private final SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(2000);
            }catch (InterruptedException exception){//simulating work

            }
            resource.consume();
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producerThread = new Thread(new Producer(resource),"producer");
        Thread consumerThread = new Thread(new Consumer(resource),"consumer");

        producerThread.start();
        consumerThread.start();
    }
}
