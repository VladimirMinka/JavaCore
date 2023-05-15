package Lesson.Collection.Set;

import java.util.*;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    Set<Employ> setEmploy = new HashSet<>();


    public void start() {
        System.out.println("1.Добавить сотрудника:");
        System.out.println("2.Удалить сотрудника по имени:");
        System.out.println("3.Вывести список сотрудников:");
        System.out.println("4.Удалить сотрудников по зарплате:");
        String answer = scanner.nextLine();
        switch (answer) {
            case "1" -> {
                addWorker();
                start();
            }
            case "2" -> {
                removeName();
                start();
            }
            case "3" -> {
                listEmploy();
                start();
            }
            case "4" -> {
                removeMoney();
                start();
            }


            default -> {
                start();
            }
        }

    }

    public void addWorker() {

        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите  зарплату:");
        int emp = scanner.nextInt();
        scanner.nextLine();
        Employ employ = new Employ(name, emp);
        setEmploy.add(employ);

    }

    public void removeName() {
        System.out.println("Введите имя для удаления");
        String nameDel = scanner.nextLine();
        Iterator<Employ> iterator = setEmploy.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(nameDel)) {
                iterator.remove();
                System.out.println("Элемент удален");
            }
        }
    }

    public void removeMoney() {
        System.out.println("Введите зарплату выше или тех кого ввели:");
        int removeMon = scanner.nextInt();
        scanner.nextLine();
        setEmploy.removeIf(e -> e.getMoney() >= removeMon);

    }
    public void listEmploy() {
        for (Employ employ : setEmploy) {
            System.out.println(employ);
        }

    }
}
