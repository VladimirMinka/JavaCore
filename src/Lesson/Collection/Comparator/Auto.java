package Lesson.Collection.Comparator;

public class Auto {
    private String model;
    private int power;

    public Auto(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
