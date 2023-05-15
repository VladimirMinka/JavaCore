package Lesson.thread3;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
             threadMethod("поток 1");
            }
        });
        System.out.println(thread.isAlive()+  " до");
        thread.start();
        System.out.println(thread.isAlive()+  " после метода start");
        System.out.println(thread.isInterrupted());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadMethod("поток 2");

            }
        });
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread3 = new Thread(() -> threadMethod("поток 3"));
        thread3.start();


        threadMethod("маин");



    }




    public static void threadMethod(String st) {
        // Thread.currentThread().setName("Поток");

        System.out.println(Thread.currentThread().getName()+ " <-----------------");
        System.out.println(Thread.currentThread().getPriority());

        for (int i = 0; i < 10; i++) {
            System.out.println(st);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
