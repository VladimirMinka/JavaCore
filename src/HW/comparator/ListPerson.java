package HW.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ListPerson {
    //ДЗ 2
    public static void main(String[] args) {
        ArrayList<Persons> listPerson = new ArrayList<>();
        listPerson.add(new Persons(30, "Anna"));
        listPerson.add(new Persons(34, "Sergey"));
        listPerson.add(new Persons(34, "Ilya"));
        listPerson.add(new Persons(30, "Vera"));
        listPerson.add(new Persons(32, "Vladimir"));
        listPerson.add(new Persons(31, "Ivan"));
        listPerson.add(new Persons(30, "Natasha"));
        Collections.sort(listPerson);
        for (Persons persons : listPerson
        ) {
            System.out.println(persons);
        }
    }
}
