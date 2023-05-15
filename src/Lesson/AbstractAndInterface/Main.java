package Lesson.AbstractAndInterface;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        Lada lada = new Lada();
        MI8 mi8 = new MI8();
    Kia kia = new Kia();

        MetaloBaza metaloBaza = new MetaloBaza();
        metaloBaza.sdatMetal(mi8);
        metaloBaza.sdatMetal(lada);
        metaloBaza.sdatMetal(bmw);

        SportCar [] sportCars = new SportCar[10];
        sportCars[0] = bmw;
        sportCars[1] = kia;

        System.out.println(Metal.n);
    }


}
