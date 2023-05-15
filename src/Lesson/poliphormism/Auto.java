package Lesson.poliphormism;

public class Auto {

    private String model;
    private int maxSpeed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Auto(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public  void markAuto(){
        System.out.println("это авто");
    }


}
