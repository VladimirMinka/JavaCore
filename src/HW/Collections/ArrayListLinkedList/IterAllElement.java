package HW.Collections.ArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class IterAllElement {
    public static void main(String[] args) {
        System.out.println("Итерировать по списку и замерить время выполнения операции");
        ArrayList<Integer> arrInt = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrInt.add(i);
        }
        long time = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            arrInt.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList ns = " + (time - endTime) / 1_000_000);


        LinkedList<Integer> linkInt = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkInt.add(i);
        }
        long timeL = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            linkInt.add(i);
        }
        long endTimeL = System.nanoTime();
        System.out.println("LinkedList ns = " + (timeL - endTimeL) / 1_000_000);
    }
}
