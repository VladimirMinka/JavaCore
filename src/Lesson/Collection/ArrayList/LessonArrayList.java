package Lesson.Collection.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LessonArrayList {
    public static void main(String[] args) {
        List<String> logins = new ArrayList<>(10);
        logins.add("Login1");
        logins.add("Login2");
        logins.add("Login3");
        //logins.add("Login3");
        //logins.set(1, "login22");
        //logins.remove(1);
        //logins.remove("Login1");
        System.out.println(logins.indexOf("Login3"));
        System.out.println(logins.indexOf("Login2"));
        System.out.println(logins.lastIndexOf("Login3"));
        //logins.clear();
        System.out.println(logins);


        ArrayList<String> login2 = new ArrayList<>();
        login2.add("Login6");
        login2.add("Login2");
        login2.add("Login1");
        //login2.addAll(logins);
        //оставляет только элементы которые есть в обоих коллекциях
        //login2.retainAll(logins);


        //удаляет повторяющиеся значения
        login2.removeAll(logins);

        System.out.println(login2);
        login2.add("login100");
        login2.add("login200");
        //возвращает коллекцию с Индекса до Индекса
        List<String> lists = login2.subList(1, 3);
        System.out.println(login2);
        System.out.println("lists " + lists);
        //logins.sort();



        login2.removeIf(e -> e.length() < 7);
        System.out.println(login2);
    }
}
