package Lesson.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {

    ArrayList<Employee> employeeList = new ArrayList<>();

    {
        employeeList.add(new Employee("John", 25, 4000));
        employeeList.add(new Employee("Anna", 25, 7000));
        employeeList.add(new Employee("Peter", 35, 10000));
        employeeList.add(new Employee("Mary", 28, 6000));
        employeeList.add(new Employee("David", 40, 12000));
        employeeList.add(new Employee("Kate", 27, 5500));
        employeeList.add(new Employee("Mark", 32, 2000));
        employeeList.add(new Employee("Lisa", 29, 6500));
        employeeList.add(new Employee("Alex", 25, 4000));
        employeeList.add(new Employee("Olivia", 26, 5200));
    }

    public void start() {
        System.out.println("1 вывести по зарплате");
        System.out.println("2 вывести по возрасту");
        System.out.println("3 вывести по имени");
        System.out.println("4 вывести по зарплате и возрасту");
        System.out.println("5 вывести по зарплате,возрасту,имени");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                sortZp();
                start();
            }
            case 2 -> {
                printAge();
                start();
            }
            case 3 -> {
                sortName();
                start();
            }
            case 4 -> {
                sortAgeZp();
                start();
            }
            case 5 -> {
                sortAgeZpName();
                start();
            }

        }

    }

    public void sortZp() {
        Collections.sort(employeeList);
        for (Employee empl : employeeList) {
            System.out.println(empl);
        }
    }

    public void printAge() {
        Comparator<Employee> comparatorAge = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Collections.sort(employeeList, comparatorAge);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public void sortName() {
        Comparator<Employee> comparatorName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(employeeList, comparatorName);
        for (Employee employeeName : employeeList) {
            System.out.println(employeeName);
        }
    }

    public void sortAgeZp() {
        Comparator<Employee> comparatorAgeZp = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int result = Integer.compare(o1.getZp(), o2.getZp());
                if (result == 0) {
                    return Integer.compare(o1.getAge(), o2.getAge());
                } else {
                    return result;
                }
            }
        };
        Collections.sort(employeeList, comparatorAgeZp);
        for (Employee employeeAgeZp : employeeList) {
            System.out.println(employeeAgeZp);

        }
    }

    public void sortAgeZpName() {
        Comparator<Employee> comparatorAgeZpName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int result = Integer.compare(o1.getZp(), o2.getZp());
                if (result == 0) {
                    int result2 = Integer.compare(o1.getAge(), o2.getAge());
                    if (result2 == 0) {
                        return o1.getName().compareTo(o2.getName());
                    }
                    return result2;
                }
                  return result;

            }
        };

        Collections.sort(employeeList, comparatorAgeZpName);
        for (Employee employeeAgeZpName : employeeList) {
            System.out.println(employeeAgeZpName);
        }
    }


}
