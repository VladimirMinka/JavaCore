package Lesson.Generic;

public class Element {
    String name;
    int price;

    public Element(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                '}';
    }
}
