package Home_Work;

import java.util.Arrays;

public class TaskArraysString {
    public static void main(String[] args) {
        /*1 скопировать данный массив в другой (весь)(черерз класс Arrays)
        2 скопировать данный массив начиная с города Москва в др массив(черерз класс Arrays)
        3 найти под какой ячейкой Питер (самому через цикл фор)
        4 применить к массиву метод сорт и вывести результат(черерз класс Arrays)
        5 вывести все города большими буквами*/

        String[] city = {"Ростов", "Сочи", "Краснодар", "Москва", "Питер", "Воронеж", "Псков"};
        //скопировать данный массив в другой (весь)(черерз класс Arrays)
        String[] copyCity = Arrays.copyOf(city, city.length);
        //2 скопировать данный массив начиная с города Москва в др массив(черерз класс Arrays)
        String[] copyCitySecond = Arrays.copyOfRange(copyCity, 3, 7);
        System.out.println(Arrays.toString(copyCitySecond));
        //3 найти под какой ячейкой Питер (самому через цикл фор)

//        for (int i = 0; i < copyCitySecond.length; i++) {
//            copyCitySecond[i] = "" + i;
//        }
//        for (int i = 0; i < copyCitySecond.length; i++) {
//            System.out.println(copyCitySecond[i]);

        //4 применить к массиву метод сорт и вывести результат(через класс Arrays)
        int[] nums = {1, 45, 2, 46, 67, 90, 7, 98, 100};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        // 5 вывести все города большими буквами*/
        String stringCity = Arrays.toString(city);
        System.out.println(stringCity.toUpperCase());
    }
}


