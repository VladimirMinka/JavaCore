package HW.poliphormism;

public class Main {
    public static void main(String[] args) {
        Iron iron = new Iron();
        Tv tv = new Tv();
        VacuumClear vacuumClear = new VacuumClear();

        startDev(iron);
    }


    static void startDev(Electro electro){
        electro.start();

    }

}
