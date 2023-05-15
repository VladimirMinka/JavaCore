package Lesson.thread2;

public class Main {
    public static void main(String[] args) {
        Potok2 potok2 = new Potok2();
        Thread thread = new Thread(potok2);
        thread.start();
        threadMethod();

    }

    public static void threadMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.print("первым появилась курица (ответ потока Маин)\r");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
