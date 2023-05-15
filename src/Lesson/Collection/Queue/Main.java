package Lesson.Collection.Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("1Igor");
        priorityQueue.add("2Anna");
        priorityQueue.add("3Vera");
        //если нет элемента то вернет Exeption
        System.out.println(priorityQueue.element());
        //если нет элемента то вернет null
        System.out.println(priorityQueue.peek());
        priorityQueue.remove();
        System.out.println(priorityQueue.peek());
        priorityQueue.remove();
        System.out.println(priorityQueue.peek());
        String name = priorityQueue.remove();
        System.out.println(priorityQueue.peek());
        //poll возвращает null если элемента нет
        System.out.println();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(100);
        arrayDeque.addFirst(97);
        arrayDeque.addFirst(56);
        arrayDeque.addLast(13);
        arrayDeque.getLast();
        //метод который удаляет и возвращает
        arrayDeque.pop();
        //offer возвращает true или false если удалось или неудалось добавить
        arrayDeque.addFirst(13);
        arrayDeque.addFirst(1);
        arrayDeque.addLast(12);
        //удаляет последнее вхождение объекта в очередь
        arrayDeque.removeLastOccurrence(13);
        //удаляет первое вхождение объекта в очередь
        arrayDeque.removeFirstOccurrence(13);

        System.out.println(arrayDeque);
    }
}
