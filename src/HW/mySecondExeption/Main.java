package HW.mySecondExeption;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws myExeption {

        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int order = scanner.nextInt();
        if ( !(order >= 1000 & order <= 10000) )
            throw new myExeption();

        System.out.println("Ваш заказ  принят " + order);
    }
}
