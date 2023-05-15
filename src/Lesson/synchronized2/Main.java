package Lesson.synchronized2;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Thread thread = new Thread(() -> {
        dataBase.enterStr("login");

        });
        thread.start();


        Thread thread1 = new Thread(() -> {
            dataBase.enterStr("pass");

        });
        thread1.start();

    }
}
