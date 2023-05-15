package Lesson.typeClass.localClass;

import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    private Apple[] ap = new Apple[100];
    private Apple[] cor = new Apple[100];


    {
        //System.out.println("сработал блок инициализации");
        ap[0] = new Apple("Кефир", 120);
        ap[1] = new Apple("Сникерс", 80);
        ap[2] = new Apple("Сухари", 150);
    }

    public void listTov() {
        for (int i = 0; i < ap.length; i++) {
            if (ap[i] != null)
                System.out.println(ap[i].name + " " + ap[i].cost);
        }
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("введите название товара");
            String product = scanner.nextLine();
            if (product.equalsIgnoreCase("стоп")) {
                break;
            }
            addProduct(product);
        }


        printCheck();


    }

    public boolean addProduct(String product) {
        for (int i = 0; i < ap.length; i++) {
            if (ap[i] != null) {
                if (ap[i].name.equalsIgnoreCase(product)) {
                    addCor(ap[i]);
                    return true;
                }
            }


        }
        return false;
    }

    public void addCor(Apple apple) {
        for (int i = 0; i < cor.length; i++) {
            if (cor[i] == null) {
                cor[i] = apple;
                break;
            }
        }
    }

    public void printCheck() {

        class Check {
            int finalPrice;


            public void print() {
                for (int i = 0; i < cor.length; i++) {
                    if (cor[i] != null) {
                        System.out.println(cor[i]);
                        finalPrice += cor[i].cost;

                    }

                }

                    System.out.println("full price " + finalPrice );
                }
            }
        Check check = new Check();
        check.print();



        }

    }
