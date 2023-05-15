package Lesson.synchronized1;

public class Main {
    public static void main(String[] args) {

        DataBase dataBase = new DataBase();


        Thread firstThread = new Thread(new MyThread (dataBase) );
        firstThread.start();

        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                dataBase.coolDown();
            }
        });
        secondThread.start();


    }
}
