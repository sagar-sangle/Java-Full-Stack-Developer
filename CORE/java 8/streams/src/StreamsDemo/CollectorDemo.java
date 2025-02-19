package StreamsDemo;

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorDemo {
    public static void main(String[] args) {
        // 1. Collecting to a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        // 2. Collecting to a Set
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        //3 colelectiin to map
        List<String> name = Arrays.asList("sagar", "vijay", "sam");
        Map<Integer, String> collect = name.stream().collect(Collectors.toMap(String::length, v -> v,(exs,repls)->exs));//if key exist kepp exs
        System.out.println("collection to map : "+collect);

        //4 count
        Long count = name.stream().collect(Collectors.counting());

        //sum
        Integer collect1 = IntStream.range(1, 10)
                .boxed()
                .collect(Collectors.summingInt(Integer::intValue));//boxed() converts IntStream → Stream<Integer>
        //Collectors.summingInt(Integer::intValue) expects a Stream<Integer>, not an IntStream.

        //averaging

        Double collect2 = IntStream.rangeClosed(1, 5)
                .boxed()
                .collect(Collectors.averagingInt(x->x));

        //summary

        IntSummaryStatistics stats = IntStream.rangeClosed(1, 5)
                .boxed()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println(stats);
        // Output: IntSummaryStatistics{count=5, sum=15, min=1, average=3.000000, max=5}


        //joining strring

        String collect3 = name.stream().collect(Collectors.joining(","));
        System.out.println(collect3);

        // 8. Grouping Elements
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        // 9. Partitioning Elements
        //  Partitions elements into two groups (true and false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));


        // Example 4: Summing Values in a Map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        // Example 5: Creating a Map from Stream Elements
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));

        // Example 6: occraunces of word
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));;


        /*


         */


    }
}
