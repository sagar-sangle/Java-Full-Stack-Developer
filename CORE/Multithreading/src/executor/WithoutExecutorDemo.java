package executor;

public class WithoutExecutorDemo {

    public static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {

            fact = fact * i;



        }
        try {

            Thread.sleep(1000);//simulating some work

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return fact;
    }

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println("start time : "+System.currentTimeMillis());
        Thread[] threads = new Thread[9];

        for (int i = 1; i <= 9; i++) {
            int num = i;  // Capture the loop variable
            /* why store i;            The loop does not wait for each thread to finish.By the time a thread actually runs, i might already be a new value!This can lead to wrong outputs or errors.*/

            threads [i-1] = new Thread(() -> {
                int result = fact(num);

                System.out.println("Factorial of " + num + " is: " + result);
            });

            threads[i-1].start();




//            try {
//                t.join();//this will perfomr sequential operation not a multithreading !
//            }catch (InterruptedException e ){
//
//            }

        }

        for (Thread t : threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("total time :"+(System.currentTimeMillis()-startTime)); ;
    }
}
