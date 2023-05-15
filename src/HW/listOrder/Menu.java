package HW.listOrder;

import java.util.Scanner;

public class Menu {
    Product[] products = new Product[2];
    Scanner scanner = new Scanner(System.in);

    public void start() {

        System.out.println(" 1 - добавить товар");
        System.out.println(" 2 - удалить товар");
        System.out.println(" 3 - посмотреть список товаров");
        System.out.println(" 4 - выйти");
        System.out.println("Выберите необходимое действие:");


        String nameProduct = scanner.nextLine();

        switch (nameProduct) {
            case "1" -> {
                if (addProduct())
                    System.out.println("товар был добавлен");
                else
                    System.out.println("товар не был добавлен");
                start();

            }
            case "2" -> {
                removeProduct();
                System.out.println("товар удален");
                start();

            }
            case "3" -> {
                System.out.println("список товаров");
                listOfProduct();
                start();


            }
            case "4" -> {
                System.exit(0);

            }
            default -> {
                System.out.println("Вы ввели другое число.Введите от 1 до 3");
                start();
            }
        }
    }


    public boolean addProduct() {

        System.out.println("Добавьте товар: ");
        String name = scanner.nextLine();
        Product product = new Product(name);
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return true;
            }
        }
        return false;
    }

    public void removeProduct() {
        System.out.println("Введите товар который хотите удалить:");
        String nameOfRemoveProduct = scanner.nextLine();

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null)
                if (nameOfRemoveProduct.equals(products[i].getNameOrder())) {
                    products[i] = null;
                    break;
                }
        }
    }

    public void listOfProduct() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null)
                products[i].info();
        }
    }
}
