package org.java.tut;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddNumberStream {

    public static List<Integer> oddNumberStream(Integer start, Integer end){

        IntStream oddNumbers= IntStream.rangeClosed(start, end).filter(n -> n % 2 != 0);

        return oddNumbers.limit(end).boxed().collect(Collectors.toList());
    }
}
