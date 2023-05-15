package Lesson.thread1;

public class Main {
    public static void main(String[] args) {
        Potok potok = new Potok();
        Thread thread = new Thread(potok);
        thread.start();

        threadMethod();

    }

    public static void threadMethod() {
        for (int i = 0; i < 20; i++) {
            System.out.println("работает поток main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
