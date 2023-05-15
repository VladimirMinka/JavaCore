package Lesson.Generic;

import HW.notebook.NoteBook;

import java.util.Arrays;

public class Exemple<T> {
    T[] array;
    T element;
    private static Object value = "12";

    public static void setValue(Object value) {
        Exemple.value = value;
    }

    String str = new String("12sdfsdf3");
    Element element2 = new Element("12e", 121);

    public Exemple(T element, T[] array) {
        this.element = (T) new Object();
        this.array = array;

    }

    public void printElement() {
        System.out.println(element);
    }

    public T getElement() {
        return element;
    }

    @Override
    public String toString() {
        return element.toString();
    }

    public static <T> T getValue() {
        return (T) value;
    }
}
