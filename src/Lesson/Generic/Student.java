package Lesson.Generic;

public class Student<T, E> {
    private int age;
    private T group;
    private E otchenka;

    public Student(int age, T group, E otchenka) {
        this.age = age;
        this.group = group;
        this.otchenka = otchenka;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public T getGroup() {
        return group;
    }

    public void setGroup(T group) {
        this.group = group;
    }

    public E getOtchenka() {
        return otchenka;
    }

    public void setOtchenka(E otchenka) {
        this.otchenka = otchenka;
    }
}
