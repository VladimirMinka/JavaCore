package Lesson.exeptions;

import java.util.Arrays;
import java.util.IllformedLocaleException;
import java.util.Scanner;

public class Main {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[5];
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            arr[i] = j;

        }
        try {
            System.out.println("подключение к серверу");
            System.out.println(10 / n);
            System.out.println(arr[5]);


        } catch (ArithmeticException e) {
            System.out.println("нельзя делить на 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("нет такой ячейки");
        } catch (Exception e) {

        } finally {
            System.out.println("отключение от сервера");
        }

        System.out.println("программа завершенна");


    }

    public static void main2(String[] args) {
        Student[] students = new Student[20];
        students[0] = new Student("Вася");
        students[19] = new Student("Сергей");
        //try {

        //  studentsNames2(students);
        ////// } catch (NullPointerException e) {
        //System.out.println("Ячейка пустая");
        //}
        //}
        try {
            printStd(students);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public static void studentsNames(Student[] students) {
//        for (Student student : students) {
//          try {
//              System.out.println(student.getName());
//          } catch (NullPointerException e){
//              e.printStackTrace();
//           }
//        }
//    }


    public static void studentsNames2(Student[] students) throws NullPointerException {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }


    public static void printStd(Student [] students)throws InterruptedException{
        for (Student student : students) {
            try {
                System.out.println(student.getName() + " поступил");
            }catch (NullPointerException e){
                System.out.println("ячейка пустая");
            }
            Thread.sleep(1000);


        }
    }

    public static void main(String[] args) {
        throw new ArithmeticException();
    }



}
