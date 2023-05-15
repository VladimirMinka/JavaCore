package HW;

public class Hw_4 {
    /**
    дз 4 создать массив заполнить его числами от 1 до 10 через цикл фор перевернуть массив
пример массива
1 2 3 4 5 6 7 8 9 10
после того как перевернули
10 9 8 7 6 5 4 3 2 1
не нужно выводить массив с конца
нужно именно переставить элементы местами
*/
    public static void main(String[] args) {

        int[] firstArray = new int[10];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i;
            System.out.print(i+ " ");
        }

        System.out.println();
        int temp;
        for (int i = 0,j=firstArray.length-1; i < firstArray.length / 2; i++,j--) {
            temp = firstArray[j];
            firstArray[j] = firstArray[i];
            firstArray[i] = temp;
        }
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
    }
}
