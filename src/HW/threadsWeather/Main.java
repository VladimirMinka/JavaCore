package HW.threadsWeather;

public class Main {

    public static void main(String[] args) {

        Weather weather = new Weather();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                weather.weatherMoscow();

            }
        });
        thread.start();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                weather.weatherRostov();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                weather.weatherKrasnodar();
            }
        });
        thread2.start();
    }
}