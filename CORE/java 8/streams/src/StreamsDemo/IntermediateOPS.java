package StreamsDemo;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOPS {

    public static void main(String[] args) {

        // Intermediate operations transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        //1 filter
        List<String> names = Arrays.asList("sagar", "akshay", "nimap", "viupul", "john","senior","sober","sagar");
        //filter those names starting with s
        Stream<String> stream = names.stream().filter(x -> x.startsWith("s"));

        //no filtering at this point
        long s = stream.filter(x -> x.startsWith("s")).count();//count is an termination operator
        System.out.println(s);

        //2 map
        System.out.println("before operation : "+names);
        Set<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toSet());
        System.out.println("after operation : "+collect);//unordered non duplicates using set

        //flatmap  converts nested structure into non nested
        List<List<String>> listof = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f")
        );
        System.out.println("nested structure : "+listof);
        List<String> liston = listof.stream().flatMap(List::stream).toList();
        System.out.println(liston);

        //sorted -> uses comparator for sorting

        List<String> list = names.stream().sorted((x,y)->x.length() - y.length()).toList();
        System.out.println(list);

        //peek->perform action on each element as it is consumed,It allows you to inspect elements at any point without modifying them.
        /*
        Use Cases of peek()
        ✅ Debugging Stream Operations
        ✅ Logging intermediate values in a pipeline
        ✅ Performing side effects without modifying data
         */

        names.stream()
                .peek(n-> System.out.println("original elements : "+n))
                .map(d->d+" developer")
                .peek(el-> System.out.println("modified element :"+el))
                .forEach(System.out::println);
        /*
        ❌ peek() does not modify elements—it only observes them.
        ❌ peek() only works when there is a terminal operation (forEach(), collect(), etc.).
        ✅ Use peek() for debugging, but prefer map() for transformations.
         */

        System.out.println("elements before limiting"+names);

        System.out.print("after limiting : ");
         names.stream().limit(3).forEach(System.out::print);

         Stream.iterate(1,x->x+1 ).skip(10).limit(20).forEach(System.out::println);


    }
}
/*
| Method                         | Description                                              | Return Type  | Example Usage                           |
|--------------------------------|----------------------------------------------------------|--------------|-----------------------------------------|
| `filter(Predicate<T>)`         | Filters elements based on a condition                    | `Stream<T>`  | `stream.filter(n -> n > 10)`           |
| `map(Function<T, R>)`          | Transforms each element in the stream                    | `Stream<R>`  | `stream.map(n -> n * 2)`               |
| `flatMap(Function<T, Stream<R>>)` | Flattens a stream of collections into a single stream  | `Stream<R>`  | `stream.flatMap(List::stream)`         |
| `distinct()`                   | Removes duplicate elements                               | `Stream<T>`  | `stream.distinct()`                    |
| `sorted()`                     | Sorts elements in natural order                         | `Stream<T>`  | `stream.sorted()`                      |
| `sorted(Comparator<T>)`        | Sorts elements using a custom comparator                | `Stream<T>`  | `stream.sorted(Comparator.reverseOrder())` |
| `peek(Consumer<T>)`            | Allows debugging without modifying the stream           | `Stream<T>`  | `stream.peek(System.out::println)`     |
| `limit(long maxSize)`          | Truncates the stream to a given size                    | `Stream<T>`  | `stream.limit(5)`                      |
| `skip(long n)`                 | Skips the first `n` elements                            | `Stream<T>`  | `stream.skip(3)`                       |

 */
