package Lesson.finalclass;

public class Auto {
    int power;
    final int COUNT = 1;

    public Auto(int power) {
        this.power = power;
    }

    public void info() {
        System.out.println("Это автомобиль"+COUNT);

    }
}
