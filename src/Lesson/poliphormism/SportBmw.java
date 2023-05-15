package Lesson.poliphormism;

public class SportBmw extends Bmw {

    public SportBmw(String model, int maxSpeed) {
        super(model, maxSpeed);
    }



    public void sportOn(){
        System.out.println("спорт режим включен");
    }
}
