package Lesson.Generic3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Vaz");
        Bmw bmw = new Bmw("X5");
        Mersedes mersedes = new Mersedes("C200");
        Person<Auto> person = new Person<>("Audi", auto);
        Person<Bmw> person2 = new Person<>("X6", bmw);
        Person<Bmw2> person3 = new Person<>("X6", new Bmw2("z1"));


        Person<? extends Auto> person1;
        person1 = person;
        person1 = person2;
        person1 = person3;

        Person<? super Bmw> person4;
        person4 = person;
        person4= person2;


        System.out.println(person2.transport.model);

        ArrayList<Bmw> arrayList = new ArrayList<>();


        Moto moto = new Moto();



    }
}
