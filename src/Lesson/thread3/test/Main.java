package Lesson.thread3.test;

public class Main {
    public static void main(String[] args) {

        NewThead newThead = new NewThead();

        Thread thread = new Thread(newThead);
        thread.start();



        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
