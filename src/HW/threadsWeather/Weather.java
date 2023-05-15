package HW.threadsWeather;

public class Weather {


    public synchronized void weatherMoscow() {
        for (int i = 0; i < 10; i++) {


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Погода в Москве +10, дождь");
        }
    }


    public synchronized void weatherRostov() {
        for (int i = 0; i < 10; i++) {


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Погода в Ростове +10, ветер");
        }
    }

    public synchronized void weatherKrasnodar() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Погода в Краснодаре солнечно,+18");
        }
    }


}



