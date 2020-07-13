package main.java.com.homework8.user;

import java.util.Objects;

public class User {
    private final String name;
    private final int age;
    private final String city;

    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User users = (User) o;
        return age == users.age &&
                name.equals(users.name) &&
                city.equals(users.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, city);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
