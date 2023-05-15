package HW.Collections.ArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class DellFirstLastElement {
    public static void main(String[] args) {
        System.out.println("Удалить первый и последний элементы списка " +
                "и замерить время выполнения операции.");
        ArrayList<Integer> removeFirst = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            removeFirst.add(i);
        }

        long timeDel = System.nanoTime();
        removeFirst.remove(0);
        removeFirst.remove(removeFirst.size() - 1);
        long endTimeDel = System.nanoTime();
        System.out.println("ArrayList RemoveElement ns = " + (timeDel - endTimeDel));
        System.out.println();

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList1.add(i);
        }
        long timeDel1 = System.nanoTime();
        linkedList1.removeFirst();
        linkedList1.removeLast();
        long endTimeDel1 = System.nanoTime();
        System.out.println("LinkedList RemoveElement ns = " + (timeDel1 - endTimeDel1));

    }
}
