package main.java.com.homework8.random;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomIntegerStream {

       private static  int streamSize = 15;
       private static  int randomNumOrigin = 0;
       private static  int getRandomNumBound = 350;
       private static final List<Integer> randomList = new Random().ints(streamSize,randomNumOrigin,getRandomNumBound).boxed().collect(Collectors.toList());

        public static void randomIntegerStreamOperations() {
        System.out.print("Random list values: ");
        System.out.println(randomList);
        printMinInRandomList(randomList);
        printMaxInRandomList(randomList);
        printAllValuesMultiplesOfTwo(randomList, 2);
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

    public static void printAllValuesMultiplesOfTwo(List<Integer>  list, int value) {
        System.out.print("All values are multiples of two : " + value);
        list.stream()
                .filter(randomList -> randomList % value == 0)
                .forEach(System.out::println);
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

