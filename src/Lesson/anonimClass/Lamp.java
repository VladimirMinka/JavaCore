package Lesson.anonimClass;

public class Lamp implements ElectroPribor{
    @Override
    public void onElectro(String str) {
        System.out.println("лампа включена "+ str);
    }
}
