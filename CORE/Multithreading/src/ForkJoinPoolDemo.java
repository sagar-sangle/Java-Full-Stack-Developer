import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolDemo {

    public static void main(String[] args) {
        System.out.println(ForkJoinPool.commonPool().getParallelism()); // Usually returns CPU cores - 1

    }
}
