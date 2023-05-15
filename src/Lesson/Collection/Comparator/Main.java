package Lesson.Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student(19, "Petr", 2));
        st.add(new Student(20, "Ilya", 2));
        st.add(new Student(17, "Sergey", 1));
        st.add(new Student(16, "Bella", 1));
        st.add(new Student(19, "Vera", 1));
        st.add(new Student(16, "Alara", 1));
        Collections.sort(st);
        for (Student student : st) {
            System.out.println(student);
        }

        ArrayList<Auto> auto1 = new ArrayList<>();
        auto1.add(new Auto("Vaz", 95));
        auto1.add(new Auto("BMW", 130));
        auto1.add(new Auto("Suzuki", 80));

        Comparator<Auto> comparator = new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        };

        Comparator<Auto> comparator2 = Comparator.comparingInt(Auto::getPower);
        Comparator<Auto> comparator3 = Comparator.comparing(Auto::getModel);



        Comparator<Auto> comparator1 = new Comparator<Auto>() {
            @Override
            public int compare(Auto model1, Auto model2) {
                return model1.getModel().compareTo(model2.getModel());
            }
        };




        Collections.sort(auto1, comparator1);
        for (Auto auto : auto1) {
            System.out.println(auto);
        }
    }
}
