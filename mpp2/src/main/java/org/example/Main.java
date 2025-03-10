package org.example;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lines = List.of("banana", "apple", "apple", "cherry", "banana", "date");

        List<String> result = processLines(lines);

        result.forEach(System.out::println);
    }

    public static List<String> processLines(List<String> lines) {
        Set<String> uniqueLines = ImmutableSet.copyOf(lines);

        return uniqueLines.stream().sorted().collect(Collectors.toList());
    }
}
