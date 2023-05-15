package Lesson.synchronized1;

public class DataBase {

    private int a = 25;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public  void heat(){
        System.out.println("нагревание начали");
        synchronized (this) {
            while (a < 50) {
                System.out.println(a + " - работает " + Thread.currentThread().getName() + " поток");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a += 1;
            }
        }

   }

    public  void coolDown(){
        System.out.println("охлаждение начали");
      synchronized (this) {
            while (a > 10) {
                System.out.println(a + " - работает " + Thread.currentThread().getName() + " поток");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a -= 1;
            }
        }
    }

}
