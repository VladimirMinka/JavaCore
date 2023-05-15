package Lesson.Collection.ArrayListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        long time = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrInt.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList nano sek = " + (time - endTime)/ 1_000_000);

        System.out.println();
        LinkedList<Integer> linkInt = new LinkedList<>();
        long timeL = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkInt.addLast(i);

        }
        long endTimeL = System.nanoTime();
        System.out.println("LinkedList nano sek = " + (timeL - endTimeL)/ 1_000_000);
    }
}
