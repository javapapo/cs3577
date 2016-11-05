package com.streamexamples;

import java.nio.channels.Pipe;
import java.time.Instant;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by javapapo on 28/10/2016.
 */
public class StreamSamples {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(5, 6, 7, 56, 33, 555, 893423, 33, 16, 62, 44);
        long above100Count = numbers.stream()
                .filter(aNumber -> aNumber > 100)
                .count();
        System.out.println(above100Count);

        List<Integer> decrements = numbers.stream()
                .filter(aNumber -> aNumber > 100)
                .map( num -> Math.decrementExact(num))
                .collect(Collectors.toList());
        System.out.println(decrements);
        System.out.println(numbers);

        //--
        List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);


        Random random = new Random();
        IntStream randoms = random.ints().limit(1_000);
        System.out.println(randoms.sum());

        //--
        Instant start = Instant.now();
        int sum = random.ints().parallel().limit(1_000_000_000).filter(x -> x>5000).sum();
        System.out.println(sum);
         long millisecs = Instant.now().minusSeconds(start.getEpochSecond()).toEpochMilli();
        System.out.println(sum +" took: "+millisecs/1000+ " secs");

    }
}
