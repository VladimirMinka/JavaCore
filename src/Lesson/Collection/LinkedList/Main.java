package Lesson.Collection.LinkedList;

import java.util.LinkedList;

public class Main {
    int s = 10;

    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("c1");
        str.add("c2");
        str.add("c3");
        System.out.println(str.getFirst());
        //str.remove("c1");
        System.out.println(str.getFirst());
        System.out.println(str.getLast());
        System.out.println(str.get(1));
        System.out.println(str.removeLast());
        System.out.println(str.removeFirst());
        //возвращает null, а remove выбрасывает исключение
        System.out.println(str.pollFirst());
        System.out.println(str.pollLast());

    }


    class S {
        int f = s;
    }

    static class S2 {

    }
}
