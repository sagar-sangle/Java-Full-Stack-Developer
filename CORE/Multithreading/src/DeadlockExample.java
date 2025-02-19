class Resource {
    private final String name;

    public Resource(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class DeadlockExample {
    public static void main(String[] args) throws InterruptedException {
        Resource resourceA = new Resource("Resource A");
        Resource resourceB = new Resource("Resource B");

        Thread thread1 = new Thread(() -> {
            synchronized (resourceA) {  // 🔹 Thread 1 locks resourceA first
                System.out.println("Thread 1 locked " + resourceA);

                try { Thread.sleep(1000); } catch (InterruptedException e) {} // Simulating work

                synchronized (resourceB) {  // 🔹 Thread 1 tries to lock resourceB
                    System.out.println("Thread 1 locked " + resourceB);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resourceB) {  // 🔹 Thread 2 locks resourceB first
                System.out.println("Thread 2 locked " + resourceB);

                try { Thread.sleep(1000); } catch (InterruptedException e) {} // Simulating work

                synchronized (resourceA) {  // 🔹 Thread 2 tries to lock resourceA
                    System.out.println("Thread 2 locked " + resourceA);
                }
            }
        });

        thread1.start();
        //Thread.sleep(1000);  // 🔴 Delay before starting thread2 (Increased to 2 seconds)
        thread2.start();
    }
}
