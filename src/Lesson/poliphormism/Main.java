package Lesson.poliphormism;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("auto", 100);
        Bmw bmw = new Bmw("x5", 240);
        SportBmw sportBmw = new SportBmw("m8", 500);
        // sportBmw.sportOn();


        int s = 100;
        byte a = (byte) s;


        Auto[] autos = new Auto[10];
        autos[0] = new Bmw("s1", 100);
        autos[1] = new SportBmw("sport1", 400);
        autos[2] = new Auto("a", 100);


        for (Auto auto1 : autos) {
            if (auto1 != null) {
                if (auto1 instanceof SportBmw) {
                    ((SportBmw) auto1).sportOn();
                }
                auto1.markAuto();
            }
        }


        //auto.markAuto();
        //  bmw.markAuto();
        // sportBmw.markAuto();

        Auto auto1 = new SportBmw("m1", 100);
        if (auto1 instanceof SportBmw) {
            ((SportBmw) auto1).sportOn();
        }

        auto1.markAuto();
        Mersedes mersedes = new Mersedes("s200",190);
        makeRemont(sportBmw);
    }


    public static void makeRemont(Auto auto) {
        System.out.println(auto.getModel() + " на ремонте");
        if (auto instanceof SportBmw){
            ((SportBmw) auto).sportOn();
        }

    }


}
