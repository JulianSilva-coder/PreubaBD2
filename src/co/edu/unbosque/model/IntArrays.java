package co.edu.unbosque.model;

import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

public class IntArrays {
    public static int[] peorCaso(int size) {
        return IntStream.rangeClosed(1, size)
                .boxed()
                .mapToInt(i -> i)
                .toArray();
    }

    public static int[] promedio(int size) {
        return new Random().ints(size, 1, size)
                .boxed()
                .mapToInt(i -> i)
                .toArray();
    }
    public static int[] mejorCaso(int size) {
        return IntStream.rangeClosed(1, size)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
    }
}
