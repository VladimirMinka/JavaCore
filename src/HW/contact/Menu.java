package HW.contact;

import java.util.Scanner;

public class Menu {
    Contact[] contacts = new Contact[20];
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println(" 1 -добавить контакт");
        System.out.println(" 2 - посмотреть список контактов");
        System.out.println(" 3 -удалить контакт");
        System.out.println(" 4 - поиск по имени");
        System.out.println("Выберите необходимое действие:");


        String sureName = scanner.nextLine();

        switch (sureName) {
            case "1" -> {
                if (addContact()) {
                    System.out.println("контакт был добавлен");
                } else {
                    System.out.println("нету места для добавления");
                }
                start();
            }
            case "2" -> {
                nameOfContact();
                start();
            }
            case "3" -> {
                if (removeContact()) {
                    System.out.println("Контакт удален");
                } else {
                    System.out.println("Контакт не найден");
                }
                start();
            }
            case "4" -> {
                    searchName();
                    start();
            }

            default -> {
                System.out.println("Вы ввели другое число.Введите от 1 до 3");
                start();
            }
        }


    }

    public boolean addContact() {
        System.out.println("name?");
        String name = scanner.nextLine();

        System.out.println("номер?");
        String nomer = scanner.nextLine();

        Contact contact = new Contact(name, nomer);
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                return true;
            }
        }
        return false;
    }

    public void searchName() {
        System.out.println("name?");
        String name = scanner.nextLine();
        for (Contact contact : contacts) {
            if (contact != null) {
                String nameIgnorCase = contact.getSurname().toUpperCase();
                if (nameIgnorCase.contains(name.toUpperCase().trim())){
                    contact.info();
                }
            }
        }


    }

    public void nameOfContact() {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null)
               contacts[i].info();
        }
    }

    public boolean removeContact() {
        System.out.println("Введите номер телефона котоырй хотите удалить:");
        String number = scanner.nextLine();
        boolean b = false;

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null)
                if (number.equals(contacts[i].getPhoneNumber())) {
                    contacts[i] = null;
                    b = true;
                }
        }
        if (b) {
            return true;
        } else {
            return false;
        }
    }


}
