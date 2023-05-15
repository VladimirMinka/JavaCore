package Lesson.anonimClass;

public class Main {
    public static void main1(String[] args) {
        TvSamsung tvSamsung = new TvSamsung();
        onElectroPribor(tvSamsung);

        onElectroPribor(new Tv() {
            @Override
            public void start() {
                System.out.println("тв lg включен");
            }

            @Override
            public void off() {
                System.out.println("lg off");
            }

            @Override
            public void onElectro(String str) {
                System.out.println(str);
            }
        });


    }
    public static void onElectroPribor(Tv tv){
        tv.start();
        tv.off();
    }


    public static void main(String[] args) {
       Lamp lamp = new Lamp();
        onElector(lamp);

        onElector((str) -> {System.out.println("холодильник включен"+ str); } );

    }

    public  static  void onElector(ElectroPribor electroPribor){
        electroPribor.onElectro("on ");
    }
}
