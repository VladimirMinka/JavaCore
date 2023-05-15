package Lesson.finalclass;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(100);
        Bmw bmw = new Bmw(120);
        SportBmw sportBmw = new SportBmw(150);
        auto.info();
        bmw.info();
        sportBmw.info();


        SportSuperBmw sportSuperBmw = new SportSuperBmw("x6");
        System.out.println(sportSuperBmw.getLs());



    }
}
