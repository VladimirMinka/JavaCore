package Lesson.Generic;

public class Main2 {
    public static void main(String[] args) {
        String[] arr = {"qwe", "eqw", "sdf"};
        String e = "elem";

        //Exemple<String> exemple = new Exemple<>(e,arr);
        //exemple.printElement();

        Element element = new Element("e2", 222);
        Element[] elements = new Element[11];
        Exemple<Element> elementExemple = new Exemple<>(element, elements);
        elementExemple.printElement();

        Student<Integer, Integer> student = new Student<>(20, 2, 5);
        Student<Integer, String> student1 = new Student<>(21, 2, "neud");
        var o = student.getOtchenka();
        System.out.println(student.getOtchenka());
        System.out.println(student1.getOtchenka());
        Exemple2 exemple2 = new Exemple2();
        exemple2.sum("werwer","werfw");

        Exemple.setValue("123");
        Exemple.setValue("234");
        String d = Exemple.getValue();
        System.out.println(d);
    }

}
