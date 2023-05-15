package Lesson.Collection.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Deque<User> deque = new LinkedList<>();

        String answer = "";

        while (true) {
            System.out.println("1.записать клиента:");
            System.out.println("2.удалить запись:");
            System.out.println("3.очистить список полностью:");
            System.out.println("4.текущий клиент:");
            System.out.println("5.выйти:");
            answer = scanner.nextLine();

            switch (answer) {
                case "1" -> {
                    deque.addFirst(new User(scanner.nextLine()));

                }
                case "2" -> {
                    deque.removeLast();
                }
                case "3" -> {
                    deque.clear();
                }
                case "4" -> {
                    System.out.println(deque.getLast().getName());

                }
                case "5" -> {
                    break;
                }

            }


        }


    }
}
