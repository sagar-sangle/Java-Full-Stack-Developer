package StreamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        //stream is a  of sequence elements which is introduced in java 8 which allows us to perform intermediate action of collection of elements
        //we can perform create intermediate and terminate action
        //key features of streams :
        //1 - functional and declarative approach like map() filter () and reduce()
        //2 - lazy evaluation operation on stream are evaluated only when necessary using termination action
        //3 - operations can be chained together
        //4 - supports parallel operation using parallel stream

        //ways of creating stream
        //1- using collection

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(12);
        list.add(12);

        List<Integer> streamednumbers = list.stream().map(num->num*2).toList();
        System.out.println(streamednumbers);

        //2 -> using arrays

        String[] initials ={"s","a","v"};
        for (String s : initials){
            System.out.println(s);
        }

        System.out.println("string after streamed---------------");
      Arrays.stream(initials).map(String::toUpperCase).forEach(System.out::println);

      //using of
        Stream<String> sagar = Stream.of("sagar", "akshay", "vipul");

        //using infinite stream
        Stream.generate(() -> 1);
        Stream.iterate(1, x -> x + 1);


    }

}
