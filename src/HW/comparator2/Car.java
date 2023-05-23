package HW.comparator2;

import java.util.Comparator;

public class Car implements Comparator<Car> {
    private int year;
    private int price;

    public Car(int year, int price) {
        this.year = year;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", price=" + price +
                '}';
    }

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
