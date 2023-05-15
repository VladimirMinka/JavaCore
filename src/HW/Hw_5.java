package HW;

import java.util.Random;

public class Hw_5 {
    /*
    напистаь двумерный массив для дней в году
(представим что в каждом месяце 30 дней)
в массиве будет 12 массивов по 30 дней
вывести данный массив
     */
    public static void main(String[] args) {
        Random random = new Random();

        int[][] month = new int[12][30]; //12 строк, 30 столбцов

        {
            for (int i = 0; i < month.length; i++) {  //идём по строкам
                for (int j = 0; j < month[i].length; j++) {//идём по столбцам
                    month[i][j] = random.nextInt(2);
                    System.out.print(" " + month[i][j] + " "); //вывод элемента
                }
                System.out.println();
            }
            //собрать кол во рабочих дней (1)
            // вывести сколько рабочих дней в кадом месяце

        }
    }
}