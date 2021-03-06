package ru.job4j.stream;

import java.util.List;
import java.util.Map;

public class TakeWhile {
    public static void main(String[] args) {
        List.of(1, 2, 3, 4).stream()
                .takeWhile(v -> v < 3)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::print);
    }

    public static class DropWhile {
        public static void main(String[] args) {
            List.of(1, 2, 3, 4).stream()
                    .dropWhile(v -> v < 3)
                    .map(v -> String.format(" %s", v))
                    .forEach(System.out::print);
        }
    }
}


