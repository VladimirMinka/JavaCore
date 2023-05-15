package Lesson.Generic3;

public class Person<T> {
    String name;
    T transport;

    public Person(String name, T transport) {
        this.name = name;
        this.transport = transport;
    }
}
