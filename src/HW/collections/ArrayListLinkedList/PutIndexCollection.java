package HW.collections.ArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class PutIndexCollection {
    public static void main(String[] args) {
        System.out.println("Получить элемент по индексу и замерить время выполнения операции.");
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arr1.add(i);
        }
        long timeDel = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            arr1.indexOf(10000);
        }
        long endTimeDel = System.nanoTime();
        System.out.println("ArrayList ns = " + (timeDel - endTimeDel) / 1_000_000);

        System.out.println();
        LinkedList<Integer> link = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            link.add(i);
        }
        long timeDel1 = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            link.indexOf(10000);
        }
        long endTimeDel1 = System.nanoTime();
        System.out.println("LinkedList ns = " + (timeDel1 - endTimeDel1) / 1_000_000);
    }
}
