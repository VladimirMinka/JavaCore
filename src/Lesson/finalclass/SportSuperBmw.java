package Lesson.finalclass;

public class SportSuperBmw {
    private int ls;
    private int km;
    private String model;



    public SportSuperBmw(int ls,int km){
        System.out.println("сработал констурктор 1");
        this.ls = ls;
        this.km = km;
        this.model = "x5";
    }

    public SportSuperBmw(){
        this.ls = 75;
        this.km = 5;
        System.out.println("сработал констурктор 2");

    }

    public SportSuperBmw (String model){
        this();
        this.model = model;
        System.out.println("конструктор 3");
    }





    public int getKm() {
        return km;
    }

    public int getLs() {
        return ls;
    }
}
