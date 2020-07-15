package main.java.com.homework8.user;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Methods {
    public static void printUserOlder(List<User> list, int age) {
        System.out.println("\n Users older " + age + ": ");
        list.stream().filter(user -> user.getAge() > age).forEach(System.out::println);

    }
    public static void printUsersYoungerFromCity(List<User> list, int age, String cityName) {
        System.out.println("\n User younger " + age + ": ");
        list.stream().filter(user -> user.getAge() < age && user.getCity().equals(cityName)).forEach(System.out::println);

    }
    public static void printAverageAge(List<User> list, String cityName) {
        AtomicReference<Double> averageAge = new AtomicReference<>((double) 0);
        list.stream().filter(user -> user.getCity().equals(cityName)).mapToInt(User::getAge).average().ifPresent(averageAge::set);
        System.out.println("\n Average age of users from the city " + cityName + ": " + averageAge);

    }
    public static void printCountUsersExcludingCity(List<User>list,String cityName){
        long count = list.stream().filter(user -> !user.getCity().equals(cityName)).count();
        System.out.println("\n Users out of town " + cityName + ": " + count);
    }
    public static void printSomeUsersOrderedByAge(List<User>list, int value){
        list.stream().sorted(Comparator.comparingInt(User::getAge)).limit(value).forEach(System.out::println);
        System.out.println("\n First 3 users in sorted sheet " + value);
    }
}
