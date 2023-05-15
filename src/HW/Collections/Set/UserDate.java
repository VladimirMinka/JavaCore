package HW.Collections.Set;

import Lesson.Collection.Set.Employ;

import java.util.*;

public class UserDate {
    private Scanner scanner = new Scanner(System.in);
    Set<User> userDates = new HashSet<>();

    public static void main(String[] args) {
        UserDate userDate = new UserDate();
        userDate.start();
    }

    public void start() {
        System.out.println("1.Добавляем данные через HashSet:");
        System.out.println("2.Выведем список HashSet:");
        System.out.println("3.Выведем список  через iterator:");
        System.out.println("4.Удалим все через iterator:");
        String answer = scanner.nextLine();
        switch (answer) {
            case "1" -> {
                hashSetDate();
                start();
            }
            case "2" -> {
                listSetDate();
                start();
            }

            case "3" -> {
                listPass();
                start();
            }
            case "4" -> {
                delAll();
                start();
            }
        }
    }

    public void hashSetDate() {
        System.out.println("Введите пароль");
        String pass = scanner.nextLine();
        System.out.println("Введите логин");
        String log = scanner.nextLine();
        User user = new User(pass, log);
        userDates.add(user);

    }

    public void listSetDate() {
        for (User userTree : userDates) {
            System.out.println(userTree);
        }
    }


    public void listPass() {
        for (User userDate : userDates) {
            System.out.println(userDate);
        }
    }

    public void delAll() {
//        Iterator<User> iterator2 = userDates.iterator();
//        while (iterator2.hasNext()){
//            iterator2.next();
//            iterator2.remove();
        userDates.clear();
        System.out.println("множество удалено");
    }

}



