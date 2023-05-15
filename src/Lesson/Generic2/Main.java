package Lesson.Generic2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> arrLits;
        arrLits = new ArrayList<Number>();



        Example<Number> example = new Example();
        example.arr = new Integer[]{3,3,3};
        for (int i = 0; i < example.arr.length; i++) {
            System.out.println(example.arr[i]);
        }
    }
}
