package HW.Collections.ArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class NewListCopyAllElement {
    public static void main(String[] args) {
        System.out.println("Создать новый список, скопировать все элементы из первого списка во второй" +
                " и замерить время выполнения операции.");
        ArrayList<Integer> arrIntAddAll = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrIntAddAll.add(i);
        }
        ArrayList<Integer> arrIntAddAll2 = new ArrayList<>(arrIntAddAll);
        for (int i = 0; i < 1000000; i++) {
            arrIntAddAll2.add(i);
        }
        long timeDel = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrIntAddAll2.add(i);
        }
        long endTimeDel = System.nanoTime();
        System.out.println("ArrayList ns = " + (timeDel - endTimeDel) / 1_000_000);

        System.out.println();

        LinkedList<Integer> linkIntAddAll = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkIntAddAll.add(i);
        }
        LinkedList<Integer> linkIntAddAll2 = new LinkedList<>(linkIntAddAll);
        for (int i = 0; i < 1000000; i++) {
            linkIntAddAll2.add(i);
        }
        long timeDel2 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrIntAddAll2.add(i);
        }
        long endTimeDel2 = System.nanoTime();
        System.out.println("LinkedList ns = " + (timeDel2 - endTimeDel2) / 1_000_000);

    }
}