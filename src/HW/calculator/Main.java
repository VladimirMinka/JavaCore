package HW.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        int ans = 0;
        char op;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("Введите +, -, *, /");
        op = scanner.next().charAt(0);


            switch (op) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    try {
                        ans = num1 / num2;
                    } catch (ArithmeticException e) {

                    }
                    break;
                default:
                    System.out.printf("Введите корректного оператора");
                    return;
            }

            System.out.println("Результат: " + ans);

    }
}
