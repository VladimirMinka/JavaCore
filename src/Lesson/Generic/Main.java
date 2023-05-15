package Lesson.Generic;

import Lesson.toObject.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object[] objects = new Object[100];
        objects[0] = new Student("Rom", 2, "Aza");
        objects[1] = "Том";
        objects[2] = new Student("Rom", 2, "Aza");
        objects[3] = new Scanner(System.in);
        String text = ((Scanner) objects[3]).nextLine();

        for (int i = 0; i < objects.length; i++) {
            System.out.println( ((Student) objects[i]).getName()  );
        }

    }
}
