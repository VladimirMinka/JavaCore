package Lesson.synchronized1;

public class MyThread implements Runnable {
    private DataBase dataBase;

    public MyThread(DataBase dataBase) {
        this.dataBase = dataBase;
    }


    @Override
    public void run() {
        dataBase.heat();
    }
}
