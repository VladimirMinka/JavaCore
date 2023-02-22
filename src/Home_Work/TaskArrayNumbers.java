package Home_Work;

import java.util.Arrays;

public class TaskArrayNumbers {
    public static void main(String[] args) {
        /* ДЗ 1
        Написать массив чисел  box 9 8 7 6 5 4 3 5 6 7 8 76 12 21 10 19 18 21
после создать массив box2 с длинной как у  box массива и скопировать туда все элементы

после отсортировать массив box2
и вывести оба массива

после через бинарный поиск проверить есть ли в обоих массивах число 10
написать почему число 10 найденно только в одном массиве
         */

        int[] box = {9, 8, 7, 6, 5, 4, 3, 5, 6, 7, 8, 76, 12, 21, 10, 19, 18, 21};
        //после создать массив box2 с длинной как у  box массива и скопировать туда все элементы
        int[] box2 = Arrays.copyOf(box, box.length);
        //после отсортировать массив box2
        Arrays.sort(box2);
        System.out.println(Arrays.toString(box));
        System.out.println(Arrays.toString(box2));
        //после через бинарный поиск проверить есть ли в обоих массивах число 10
        System.out.println(Arrays.binarySearch(box, 10));
        System.out.println(Arrays.binarySearch(box2, 10));
        /*написать почему число 10 найденно только в одном массиве
        потому что перед использованием binarySearch нудно отсортировать массив.
         */

        /*ДЗ 2
        создать массив a пустой с длинной 100 элементов и заполнить  его числами 10, после чего скопировать в другой массив b
        и сравнить их на равенство после создать еще  массив  и скопировать туда массив b (только половину массива)
     вывести все 3 массива */
        //создаем массив
        int[] num = new int[100];
        //заполняем
        Arrays.fill(num, 10);
        //копируем один массив в другой
        int[] num2 = Arrays.copyOf(num, num.length);
        // сравниваем
        System.out.println(Arrays.equals(num, num2));
        //создаем новый массив, копируем в него половину другого массива
        int[] num3 = Arrays.copyOf(num2, num2.length / 2);
        // выводим все 3 массива
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));
        //ДЗ_3
        // дз 3 написать метод который принимает массив  типа double и сортирует его (сортировка вручную пузырьком)
        printArray(new double[]{1.9, 6.0, 78.3, 89.0, 99.9});
    }

    static void printArray(double[] array) {
        // sorted    метка отсортирован массив или нет
        boolean sorted = false;
        double a;
        while (!sorted) {
            // сначала предполагаем что массив отсорттирован
            sorted = true;
            // проходим по массиву и добавляем -1 чтобы не выйти за пределы массива
            for (int i = 0; i < array.length - 1; i++) {
                //сравниваем попарно элементы массива. Сравниваем i и i+1 если i больше  чем  i+1 то ставим  false  и произодится обмен
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
        }
        System.out.print(Arrays.toString(array));
    }

}
