package HW.collections.ArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class DelAllElement {
    public static void main(String[] args) {
        System.out.println("Удалить все элементы из списка и замерить время выполнения операции.");
        ArrayList<Integer> arrIntDel = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrIntDel.add(i);
        }
        long timeDel = System.nanoTime();
        for (int i = 0; i < 5000000; i++) {
            arrIntDel.clear();
        }

        long endTimeDel = System.nanoTime();
        System.out.println("ArrayList ns = " + (timeDel - endTimeDel) / 1_000_000);
        LinkedList<Integer> linkIntDel = new LinkedList<>();

        for (int i = 0;i < 1000000; i++) {
            linkIntDel.add(i);
        }

        long timeLDel = System.nanoTime();
        for (int i = 0; i < 5000000; i++) {
            linkIntDel.clear();
        }

        long endTimeLDel = System.nanoTime();
        System.out.println("LinkedList ns = " + (timeLDel - endTimeLDel) / 1_000_000);
    }
}
