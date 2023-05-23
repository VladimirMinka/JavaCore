package HW.comparator2;

import java.util.Comparator;

public class City implements Comparator<City> {
    private int number;
    private String nameCity;

    public City(int number, String nameCity) {
        this.number = number;
        this.nameCity = nameCity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    @Override
    public String toString() {
        return "City{" +
                "number=" + number +
                ", nameCity='" + nameCity + '\'' +
                '}';
    }

    @Override
    public int compare(City o1, City o2) {
        return o1.number - o2.number;
    }
}
