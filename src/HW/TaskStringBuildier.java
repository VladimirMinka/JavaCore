package HW;

public class TaskStringBuildier {
    public static void main(String[] args) {
        //дз2 StringBuilder
        //1 вывести инфу чем отличается StringBuilder от StringBuffer
        //создать объект StringBuilder
        //написать программу которая принимает от пользователя через цикл фор строку и добавляешь ее в StringBuilder
        //после каждого добавления строки от пользоватея так же добавлять запятую
        //после вывести получившуюся строку
        //после вывести ее наоборот
        //после вывести длинну строки
        //после удалить последний символ и снва вывести строку


        //создать объект StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        //Добавляем строку в StringBuilder 5 раз и добавляем символ-запятую
        for (int i = 0; i < 5; i++) {
            stringBuilder.append("Строка").append(',');
        }

        // выводим на экран
        System.out.println(stringBuilder);
        //после вывести ее наоборот
        System.out.println((stringBuilder.reverse()));
        //после вывести длинну строки
        System.out.println("Длина строки:" + stringBuilder.length());
        ////после удалить последний символ и снова вывести строку
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length()-1));

    }

}
