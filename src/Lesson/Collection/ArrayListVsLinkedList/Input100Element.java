package Lesson.Collection.ArrayListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Input100Element {

    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            arrInt.add(i);
        }

        long time = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            arrInt.add(arrInt.size() / 2, i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList nano sek = " + (time - endTime) / 1_000_000);

        System.out.println();


        LinkedList<Integer> linkInt = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            linkInt.add(i);

        }
        long timeL = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            linkInt.add(linkInt.size() / 2, i);
        }

        long endTimeL = System.nanoTime();
        System.out.println("LinkedList nano sek = " + (timeL - endTimeL) / 1_000_000);
    }
}
