package Lesson.anonimClass;

public class Pk implements ElectroPribor {
    @Override
    public void onElectro(String str) {
        System.out.println("пк включен"+str);
    }
}
