package main.java.com.homework8.user;


import java.util.Arrays;
import java.util.List;

public class UserListOperation extends Methods {
    public static void userListOperation() {
        List<User> list = Arrays.asList(
                new User("Vasya", 16, "Dnipro"),
                new User("Petya", 23, "Dnipro"),
                new User("Elena", 42, "Lutsk"),
                new User("Elena", 92, "Chernigov"),
                new User("Sergey", 5, "Kiev"),
                new User("Maryna", 32, "Kiev"),
                new User("Ivan Ivanovich", 69, "Lviv"));

        printUserOlder(list, 40);
        printUsersYoungerFromCity(list, 50, "Dnipro");
        printAverageAge(list, "Lviv");
        printCountUsersExcludingCity(list, "Kiev");
        printSomeUsersOrderedByAge(list, 3);
    }

}