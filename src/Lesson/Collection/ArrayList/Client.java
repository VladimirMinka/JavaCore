package Lesson.Collection.ArrayList;

public class Client {
    private int id;
    private String name;
    private double sumremont;
    private String times;
    //время записи формат строки

    public Client(int id, String name, double sumremont, String times) {
        this.id = id;
        this.name = name;
        this.sumremont = sumremont;
        this.times = times;
    }


    public String getTime() {
        return times;
    }

    public void setTime(String times) {
        this.times = times;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSumremont() {
        return sumremont;
    }

    public void setSumremont(double sumremont) {
        this.sumremont = sumremont;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sumremont=" + sumremont +
                ", times='" + times + '\'' +
                '}';
    }
}
