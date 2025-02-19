package StreamsDemo;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {


    public static void main(String[] args) {
        // A type of stream that enables parallel processing of elements
        // Allowing multiple threads to process parts of the stream simultaneously
        // This can significantly improve performance for large data sets
        // workload is distributed across multiple threads



        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(1000).toList();//15 seconds for 200000
        long startTime = System.currentTimeMillis();
        List<Long> factorialsList = list.stream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream: " + (endTime - startTime) + " ms");

        // Parallel streams are most effective for CPU-intensive or large datasets where tasks are independent
        // They may add overhead for simple tasks or small datasets

        long start=System.currentTimeMillis();
        List<Long> list1 = list.parallelStream().map(ParallelStream::factorial).toList();
        long end=System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: " + (end - start) + " ms");//2 seconds for 200000


        List<Integer> list2 = Stream.iterate(1, x -> x + 1).limit(100).toList();



        // [1, 2, 3, 4, 5] --> [1, 3, 6, 10, 15]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum =  new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.stream().sequential().map(sum::addAndGet).toList();
        System.out.println("Expected cumulative sum: [1, 3, 6, 10, 15]");
        System.out.println("Actual result with parallel stream: " + cumulativeSum);


        //sum
        Integer result = list2.stream().reduce(0, (a, v) -> a + v);
        System.out.println("result is :"+result);

        //When using parallel streams, use the three-argument version of reduce():
        //The combiner  arg is used when parallel streams split tasks across multiple threads.

        Integer ParallelResult = list.stream().parallel().reduce(0, Integer::sum, Integer::sum);
        System.out.println(ParallelResult);




        /*
        identity	Initial/default value (e.g., 1 for multiplication, 0 for sum).
        accumulator	Function that processes elements in each thread.
        combiner	Function that merges results from multiple threads.

        The stream [1, 2, 3, ..., 10] is split into chunks (e.g., [1,2,3], [4,5], [6,7], [8,9,10]).
        Each chunk is processed separately using (a, b) -> a + b (accumulator).
        Partial sums are merged using (a, b) -> a + b (combiner).
         */





    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

//    private static long factorial(long n){
//
//        if(n==0 || n==1){
//            return 1;
//        }
//        return n*factorial(n-1);
//    }
    /*

    1st Call: factorial(5)
Calls factorial(4)
Waits for the result

2nd Call: factorial(4)
Calls factorial(3)
Waits for the result
3rd Call: factorial(3)
Calls factorial(2)
Waits for the result
4th Call: factorial(2)
Calls factorial(1)
Waits for the result
5th Call: factorial(1) (Base Case)
n == 1, so returns 1 immediately.

factorial(5)
    → factorial(4)
        → factorial(3)
            → factorial(2)
                → factorial(1) → 1 (Base case)
            ← 2 * 1 = 2  (returns 2)
        ← 3 * 2 = 6  (returns 6)
    ← 4 * 6 = 24  (returns 24)
← 5 * 24 = 120  (returns 120)

     */
}
