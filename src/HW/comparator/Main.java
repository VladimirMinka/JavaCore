package HW.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        ArrayList<Car> listCart = new ArrayList<>();
        listCart.add(new Car(1990, "BMW X5", 100));
        listCart.add(new Car(1995, "Mark II", 120));
        listCart.add(new Car(2022, "Land Cruiser 100", 150));
        listCart.add(new Car(2014, "KIA RIO", 110));
        listCart.add(new Car(2015, "OPEL ASTRA", 95));
        listCart.add(new Car(2010, "SUZUKI ESCUDO", 110));
        listCart.add(new Car(1990, "MAZDA CX 5", 100));


        Comparator<Car> carComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int result = Integer.compare(o1.getEngine().getLs(), o2.getEngine().getLs());
                if (result == 0) {
                    return o1.getModel().compareTo(o2.getModel());
                }else {
                    return result;
                }
            }
        };

        Collections.sort(listCart, carComparator);
        for (Car car : listCart) {
            System.out.println(car);
        }
    }
}



