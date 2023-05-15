package Lesson.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Student, List<Integer>> dateStudent = new HashMap<>();
        ArrayList<Integer> array1 = new ArrayList<>();

        dateStudent.put(new Student(1), List.of(3, 3, 5, 4, 2));
        dateStudent.put(new Student(1), List.of(3, 4, 5, 4, 5));
        dateStudent.put(new Student(1), List.of(3, 3, 5, 4, 2));
        dateStudent.put(new Student(2), List.of(2, 3, 3, 2, 2));
        dateStudent.put(new Student(2), List.of(1, 1, 1, 4, 2));
        for (Map.Entry<Student, List<Integer>> entry : dateStudent.entrySet()) {
            if (entry.getKey().facultet == 2) {
                for (Integer integer : entry.getValue()) {
                    System.out.print(integer + " ");

                }
                System.out.println();
            }

        }


    }

    static class Student {
        private int facultet;

        public int getFacultet() {
            return facultet;
        }

        public Student(int facultet) {
            this.facultet = facultet;
        }
    }
}
