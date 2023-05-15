package HW.Collections.Set;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class setTreeDateInt {
    static SortedSet<Integer> userDates1 = new TreeSet<>();

    public static void main(String[] args) {

        userDates1.add(1);
        userDates1.add(99);
        userDates1.add(101);
        userDates1.add(107);
        for (Integer integer : userDates1) {
            System.out.print(integer + " ");
            ;
        }
        System.out.println();
        removeIf100();
        for (Integer integer : userDates1) {
            System.out.print(integer + " ");
        }
    }

    public static void remove100() {

        Iterator<Integer> iter100 = userDates1.iterator();
        while (iter100.hasNext()) {
            if (iter100.next() < 100) {
                iter100.remove();
            }
        }

    }

    public static void removeIf100() {
        userDates1.removeIf(e -> e < 100);

    }


}
