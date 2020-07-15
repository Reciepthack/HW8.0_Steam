package main.java.com.homework8.random;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomIntegerStream {

    public static void randomIntegerStreamOperations() {
        List<Integer> randomList = new Random().ints(15,1,350).boxed().collect(Collectors.toList());
        System.out.print("Random list values: ");
        System.out.println(randomList);

        printMinInRandomList(randomList);
        printMaxInRandomList(randomList);
        printAllValuesMultiplesOfTwo(randomList);
        increaseAndPrintAllValuesInList(randomList, 10);
    }

    public static void printMinInRandomList(List<Integer> list) {
        System.out.print("Min in list: ");
        list.stream()
                .min(Integer::compareTo)
                .ifPresent(System.out::println);
    }

    public static void printMaxInRandomList(List<Integer> list) {
        System.out.print("Max in list: ");
        list.stream()
                .max(Integer::compareTo)
                .ifPresent(System.out::println);
    }

    public static void printAllValuesMultiplesOfTwo(List<Integer>  list) {
        System.out.print("All values are multiples of two : ");
        list.stream()
                .filter(value -> value % 2 == 0)
                .forEach(value -> System.out.print(value + "; "));
        System.out.println();
    }

    public static void increaseAndPrintAllValuesInList(List<Integer> list, int valueForIncrease) {
        System.out.print("All numbers increased by " + valueForIncrease + ": ");
        list.stream()
                .map(i -> i + valueForIncrease)
                .forEach(value -> System.out.print(value + "; "));
        System.out.println();
    }
}

