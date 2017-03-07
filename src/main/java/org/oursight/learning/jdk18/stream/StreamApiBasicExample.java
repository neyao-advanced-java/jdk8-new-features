package org.oursight.learning.jdk18.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by neyao on 2017/3/7.
 */
public class StreamApiBasicExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> stream = numbers.stream();
        stream.filter(
                (x -> x % 2 == 0)
        )
                .map(x -> x * x)
                .forEach(System.out::println);
    }


}
