package HW.comparator2;

import Lesson.Collection.Comparator.Auto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        //Отсортировать список объектов класса Student по среднему баллу(у студента есть массив с баллами)- через Comparable
        ArrayList<Student> gradeStudent = new ArrayList<>();
        gradeStudent.add(new Student("Ilya", 4));
        gradeStudent.add(new Student("Anna", 3));
        gradeStudent.add(new Student("Natasha", 4));
        gradeStudent.add(new Student("Vera", 5));
        gradeStudent.add(new Student("Sergey", 4));
        gradeStudent.add(new Student("Evgeniy", 2));
        Collections.sort(gradeStudent);
        for (Student student : gradeStudent) {
            System.out.println(student);
        }
        System.out.println();
        //Отсортировать список объектов класса Employee по зарплате и по фамилии - через Comparable
        ArrayList<Employee> listEmpoyee = new ArrayList<>();
        listEmpoyee.add(new Employee("Sergey", 100000));
        listEmpoyee.add(new Employee("Valery", 30000));
        listEmpoyee.add(new Employee("Nusha", 30000));
        listEmpoyee.add(new Employee("Jonh", 300000));
        listEmpoyee.add(new Employee("Ahmed", 100000));
        Collections.sort(listEmpoyee);
        for (Employee employee : listEmpoyee) {
            System.out.println(employee);
        }
        System.out.println();
        //Отсортировать список объектов класса Car по году выпуска и по цене- через Comparator
        ArrayList<Car> auto1 = new ArrayList<>();
        auto1.add(new Car(1990, 15000));
        auto1.add(new Car(1990, 17000));
        auto1.add(new Car(1992, 12000));
        auto1.add(new Car(1992, 15000));
        auto1.add(new Car(1993, 25000));
        auto1.add(new Car(1993, 35000));
        auto1.add(new Car(2000, 1500));
        auto1.add(new Car(2000, 115000));

        Comparator<Car> ListCar2 = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int result = o1.getYear() - o2.getYear();
                if (result == 0) {
                    return Integer.compare(o1.getPrice(), o2.getPrice());
                }
                return result;
            }
        };
        Collections.sort(auto1, ListCar2);
        for (Car car : auto1) {
            System.out.println(car);
        }
        System.out.println();
        //Отсортировать список объектов класса Musician по дате рождения и по имени -  через Comparator
        ArrayList<Musician> listMusician = new ArrayList<>();
        listMusician.add(new Musician(1990, "Ilya"));
        listMusician.add(new Musician(1990, "Natasha"));
        listMusician.add(new Musician(1981, "Anna"));
        listMusician.add(new Musician(1981, "Boris"));

        Comparator<Musician> listM = new Comparator<Musician>() {
            @Override
            public int compare(Musician o1, Musician o2) {
                int result = o1.getYear() - o2.getYear();
                if (result == 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        };
        Collections.sort(listMusician, listM);
        for (Musician musician : listMusician) {
            System.out.println(musician);
        }
        System.out.println();

        //Отсортировать список объектов класса City по численности населения и по имени -  через Comparator
        ArrayList<City> listCity = new ArrayList<>();
        listCity.add(new City(200000, "Orel"));
        listCity.add(new City(200000, "Vladimir"));
        listCity.add(new City(300000, "Tula"));
        listCity.add(new City(300000, "Omsk"));

        Comparator<City> listCity2 = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                int result = Integer.compare(o1.getNumber(), o2.getNumber());
                if (result == 0) {
                    return o1.getNameCity().compareTo(o2.getNameCity());
                }
                return result;
            }
        };
        Collections.sort(listCity, listCity2);
        for (City city : listCity) {
            System.out.println(city);
        }
    }


}
