import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SynchronizedMusic{


    public synchronized void playMusic(String music){

        try {
            System.out.print(this.getClass().getSimpleName()+"playing "+music);
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.print(".");

            }
            System.out.println();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }




}

class LockMusic{


    private Lock lock = new ReentrantLock();

    public  void playMusic(String music){

    /*
     lock.lock();
    The second thread gets blocked when calling lock.lock().
It remains in the waiting state until the first thread calls lock.unlock().
As soon as the lock is available, the waiting thread gets it and executes. for lock method
     */

        //for tryLock
        /*
         Behavior of tryLock():

If the lock is available, the thread gets it and executes.
If the lock is not available, the thread skips execution instead of waiting.
         */

        if(lock.tryLock()) {

            try {
                System.out.print("playing " + music);
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(1000);
                    System.out.print(".");

                }
                System.out.println();


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }else {
            System.out.println("could not get the music yet beacuse it is locked");
        }


    }




}




public class LockAndSynchronization {

    public static void main(String[] args) {

        SynchronizedMusic dolare= new SynchronizedMusic();
        LockMusic bango = new LockMusic();





        Thread spotify = new Thread(()->{
//            dolare.playMusic("do la re do la re ");
            bango.playMusic("bango bango bango");
        });

        Thread savan = new Thread(()->{
//            dolare.playMusic("do la re do la re ");
            bango.playMusic("bango bango bango");
        });

        spotify.start();
        savan.start();



    }
}
