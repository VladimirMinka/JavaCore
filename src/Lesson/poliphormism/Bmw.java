package Lesson.poliphormism;

public class Bmw extends Auto{


    public Bmw(String model, int maxSpeed) {
        super(model, maxSpeed);
    }


    @Override
   final public void markAuto() {
        System.out.println("это Бмв");
    }
}
