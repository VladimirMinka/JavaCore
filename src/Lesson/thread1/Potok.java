package Lesson.thread1;

public class Potok extends Thread{

    @Override
    public void run() {
       threadMethod();
    }

    public  void threadMethod() {
        for (int i = 0; i < 20; i++) {
            System.out.println("работает поток 2");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }


}
