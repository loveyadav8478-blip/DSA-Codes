package com.streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoreStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(arr).filter(x -> x % 2 == 0).sum();
//        System.out.println(sum);


        List<String> lst = Arrays.asList("AWS", "GCP", "AZURE");
        Stream<String> lstStream = lst.stream();


        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4);

        Stream<Integer> iterate = Stream.iterate(0, n -> n + 1).limit(101);
        Iterator<Integer> it = iterate.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Stream<Integer> limit = Stream.generate(() -> (int) (Math.random() * 100)).limit(11);
        Iterator<Integer> it2 = limit.iterator();
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }

//        Square the all numbers
        List<Integer> nums = Arrays.asList(1, 31, 42, 12, 5, 6, 7, 34, 56, 7, 746, 264, 42);
        List<Integer> evens = nums.stream()
                .filter(x -> x % 2 == 0)
                .toList();

        List<Integer> integerStream = evens.stream()
                .map(x -> x * x)
                .toList();

//        ------------------OR-----------------
        List<Integer> list = nums.stream()
                .map(x -> x * x)
                .toList();

//        System.out.println(evens);


        List<Integer> list1 = nums.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .limit(4)
                .distinct()
                .sorted((a, b) -> (b - a))
                .skip(2)
                .peek(x -> System.out.println(x))
                .toList();
        System.out.println(list1);

        var list2 = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .toList();
        System.out.println(list2);

        //        USE OF MAX

        Stream.iterate(0,x->x+1)
                .limit(101)
                .map(x -> x/20)
                .skip(1)
                .distinct()
                .peek(System.out::println)
                .max((a,b)->a-b).get();
    }

}