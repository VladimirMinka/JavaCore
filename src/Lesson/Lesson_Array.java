package Lesson;

public class Lesson_Array {
    public static void main(String[] args) {
        int [] arr = new int[100];
        int [] arr2 = {1,23,4,5,6};

        int [][]array = new int[5][5];
        array[4][3] = 8;
        array [1][3] = 10;
        array [2][1] = 5;
        array [4][4] = 15;


        int [][] array2 = {{1,2,3,42,5} , {1,2,33},{1,21}};

        System.out.println(array2[1][2]);
        System.out.println(array2[0][3]);
        System.out.println(array2[2][1]);

        for (int i = 0; i <array2.length ; i++) {
            for (int i1 = 0; i1 < array2[i].length; i1++) {
                System.out.print(array2[i][i1] +" ");
            }
            System.out.print("|");
        }

    }
}
