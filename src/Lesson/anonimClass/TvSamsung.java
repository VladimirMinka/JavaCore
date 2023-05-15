package Lesson.anonimClass;

public class TvSamsung extends Tv{
    @Override
    public void start() {
        System.out.println("самуснг включился");
    }

    @Override
    public void off() {
        System.out.println("самсунг выключился");
    }

    @Override
    public void onElectro(String str) {
        start();
    }
}
