package Lesson;

import java.util.Arrays;

public class Lesson_Method {
    public static void main(String[] args) {
        int length = methodString("Moscow");
        System.out.println(methodString("yfuygu") + 2);

        int ans = sumNumbers(1, 2, 432, 123, 234, 2);
        System.out.println(ans);
        int[] arr1 = {12, 3, 1231, 2, 42, 34};
        int[] arr2 = {12, 3, 1213, 12, 412, 34};
        int[] arr3 = {112, 13, 1123, 2, 42, 34};
        int sumArr = sumArrays(arr1, arr2, arr3);
        System.out.println(sumArr);


         String [] s = sumArrayString("anna","vera","olga");
        System.out.println(Arrays.toString(s));

    }

    public static int methodString(String str) {
        return str.length() * 2;
    }

    public static int sumNumbers(int... box) {
        int sum = 0;
        for (int i : box) {
            sum += i;
        }
        return sum;
    }


    public static int sumArrays(int[]... arrs) {
        int sum = 0;
        for (int[] arr : arrs) {
            for (int i : arr) {
                sum += i;
            }
        }
        return sum;
    }

    public static String[] sumArrayString(String... arrStr) {
        String[] str1 = new String[arrStr.length];
        for (int i = 0; i < str1.length; i++) {
            str1[i] = arrStr[i] + "" + (i + 1);
        }
        return str1;

    }


}
