package HW.comparator2;

import java.util.Comparator;

public class Musician implements Comparator<Musician> {
    private int year;
    private String name;

    public Musician(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Musician{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(Musician o1, Musician o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
