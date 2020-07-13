package main.java.com.homework8.user;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class UserListOperation {
    public static void userListOperation() {
        List<User> list = Arrays.asList(
                new User("Вася", 16, "Днепр"),
                new User("Петя", 23, "Днепр"),
                new User("Елена", 42, "Луцк"),
                new User("Елена", 92, "Чернигов"),
                new User("Сергей", 5, "Киев"),
                new User("Марина", 32, "Киев"),
                new User("Иван Иванович", 69, "Львов"));

        outputUserOlder(list, 40);
        outputUsersYoungerFromCity(list, 50, "Днепр");
        outputAverageAge(list, "Львов");
        outputCountUsersExcludingCity(list, "Киев");
        outputSomeUsersOrderedByAge(list, 3);
    }

    public static void outputUserOlder(List<User> list, int age) {
        System.out.println("\n Пользователи старше " + age + ": ");
        list.stream().filter(user -> user.getAge() > age).forEach(System.out::println);

    }

    public static void outputUsersYoungerFromCity(List<User> list, int age, String cityName) {
        System.out.println("\n Пользователи младше " + age + ": ");
        list.stream().filter(user -> user.getAge() < age && user.getCity().equals(cityName)).forEach(System.out::println);

    }
    public static void outputAverageAge(List<User> list, String cityName) {
        AtomicReference<Double> averageAge = new AtomicReference<>((double) 0);
        list.stream().filter(user -> user.getCity().equals(cityName)).mapToInt(User::getAge).average().ifPresent(averageAge::set);

        System.out.println("\n Средний возраст пользователей из города " + cityName + ": " + averageAge);

    }
    public static void outputCountUsersExcludingCity(List<User>list,String cityName){
        long count = list.stream().filter(user -> !user.getCity().equals(cityName)).count();
        System.out.println("\n Пользователи не из города " + cityName + ": " + count);
    }
    public static void outputSomeUsersOrderedByAge(List<User>list, int value){
        list.stream().sorted(Comparator.comparingInt(User::getAge)).limit(value).forEach(System.out::println);
        System.out.println("\nПервые  3 пользователя в отсортированом листе " + value);
    }
}