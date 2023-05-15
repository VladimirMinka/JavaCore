package Lesson.finalclass;

public class Bmw extends Auto {


    public Bmw(int power) {
        super(power);
    }

    @Override
    public final void info() {
        System.out.println("Это Bmw");
    }
}
