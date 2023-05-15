package Lesson.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    List<Client> clients = new ArrayList<>();
    double value = 5000.00;
    int id = 1;
    String[] date = {"10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00"}; // дописать массив
    Scanner scanner = new Scanner(System.in);

    public void menus() {
        int choice = 0;
        System.out.println("Автосервис");
        System.out.println("1 запись на диагностику");//запись по времени добавить
        System.out.println("2 вывести все записи");
        System.out.println("3 удалить все записи");
        System.out.println("4 перезаписать запись по сумме");//сумму
        System.out.println("5 вывести записи ремонт которых дороже 5000");
        System.out.println("6 удалить запись по id");
        System.out.println("7 вывести запись по имени клиента(всех клиентов");
        System.out.println("8 вывести запись по id");
        System.out.println("9 Выход");
        System.out.println("Сделайте выбор 1-9");

        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                record();
                menus();
                break;

            case 2:
                allRecord();
                menus();
                break;
            case 3:
                removeRecord();
                menus();
            case 4:
                recordSum();
                menus();
            case 5:
                recordFrom5000();
                menus();
            case 6:
                removeRecordId();
                menus();
            case 7:
                nameClient();
                menus();
            case 8:
                outRecordId();
                menus();
            default:
                System.out.println("выход");
        }
    }

    public void record() {
        //1
        System.out.println("введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("введите сумму ремонта");

        int sum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("введите время записи");
        String dates = scanner.nextLine();
        Client client = new Client(id++, name, sum, dates);


        if (client.getTime().contains(date.toString())) {
            System.out.println("это время занято");
        } else
            clients.add(client);
    }


    public void allRecord() {
        //2
        System.out.println("вывести все записи");
        for (Client person : clients)
            System.out.println(person);
    }


    public void removeRecord() {
        //3
        clients.clear();
        System.out.println("Все записи удалены");
    }

    public void recordSum() {
        //4 перезаписать запись по сумме

        System.out.println();
        System.out.println("перезаписать запись по сумме");
    }

    public void recordFrom5000() {
        //5
        for (Client sumRemont5000 : clients) {
            if (sumRemont5000.getSumremont() > value) {
                System.out.println("сумма ремонта свыше 5000 " + sumRemont5000);
            }
        }
    }

    public void removeRecordId() {
        //6
        System.out.println("введите id который вы хотите удалить");
        Scanner scanner = new Scanner(System.in);
        int idClientDelete = scanner.nextInt();
        for (Client idCl : clients) {
            if (idClientDelete == idCl.getId()) {
                clients.remove(idClientDelete);
            }
            System.out.println("Запись по  выбранному  id удалена");
        }
    }

    public void nameClient() {
        //7
        // вывести запись по имени клиента(всех клиентов
        for (Client nameCl : clients) {
            System.out.println(nameCl.getName());
        }
    }

    public void outRecordId() {
        //8 Вывести запись по  Id
        System.out.println("введите id");
        Scanner scanner = new Scanner(System.in);
        int idCl = scanner.nextInt();
        for (Client recordId : clients) {
            if (idCl == recordId.getId()) {
                System.out.println("id" + recordId);
            }
        }
    }
}