package Lesson.thread2;

public class Potok2 implements Runnable{
    @Override
    public void run() {
    threadMethod();
    }

    public  void threadMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.print("первым появилось яйцо(Ответ потока Potok 2)\r");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
