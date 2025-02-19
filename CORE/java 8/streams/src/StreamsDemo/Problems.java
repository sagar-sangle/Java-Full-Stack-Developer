package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problems {

    public static void main(String[] args) {

        //Group a list of cities by their first letter using Collectors.groupingBy().
        List<String> cities = Arrays.asList("Pune", "Mumbai", "Nagpur", "delhi", "AhilyaNagar", "Pathardi");
        System.out.println(cities.stream().collect(Collectors.groupingBy((x->x.charAt(0)))));;

        //Given a list of numbers, group them by whether they are even or odd using Collectors.partitioningBy().
        System.out.println(Stream.of(1,2,4,6,7,4,5,7).collect(Collectors.partitioningBy(n->n%2==0)));

        //Count the occurrences of each word in the sentence: "apple banana apple orange banana apple".
        List<String> fruits = Arrays.asList("apple ", "banana", "apple", "orange ", "banana", "apple");
        System.out.println(fruits.stream().collect(Collectors.toMap(k->k,v->1,(exs,repl)->repl+1)));

        //count the occurrences of character in each sentence-> "streams are powerful"
        List<String> sentances = Arrays.asList("streams are powerful", "java is powerful", "you are a developer");
        Map<IntStream, Long> collect = sentances.stream().map(s -> s.replaceAll("\\s", "")).map(String::chars).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));



    }
}
 /*



Given a list of employees, group them by department and count the number of employees in each department.
Find the sum of all elements in a list using Stream.reduce().
Find the maximum number in a list using Stream.reduce().
Compute the average of a list of integers using Collectors.averagingInt().
Given a Map<String, Integer>, find the total sum of values using Collectors.summingInt().
Find the highest salary in a list of employees using Collectors.maxBy().
Transformations & Mapping
Convert a list of names into a Map where the key is the name length and the value is the name itself.
Convert a list of integers into a comma-separated String using Collectors.joining().
Convert a List<Employee> into a Map<String, List<Employee>> grouped by department.
Convert a list of words into a Set of their lowercase versions using Collectors.toSet().
Generate an infinite stream of random numbers using Stream.generate() and collect the first 10 numbers into a list.
Create an IntStream of numbers from 1 to 100 and compute their sum using IntStream.sum().
Find the second-highest salary in a list of employees using streams.
Convert a list of integers into a Map<Integer, String>, where the key is the number and the value is "Even" or "Odd".
Find the longest word in a list of strings using Collectors.maxBy().
     */