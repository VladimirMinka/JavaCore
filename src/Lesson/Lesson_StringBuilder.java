package Lesson;

public class Lesson_StringBuilder {
    public static void main(String[] args) {
        //потокоНебезопасен/Если нет многопоточки, то используем его.Экономит память по-сравнению со String
        StringBuilder stringBuilder = new StringBuilder("heello 0 ");
        //потокобезопасен.Но медленее
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder);

        stringBuilder.append("hello1 ");
        stringBuilder.append("hello2 ").append("hello3");
        //добавляет символ после 6 по счету символа
        stringBuilder.insert(8, ",");
        stringBuilder.reverse();
        System.out.println(stringBuilder.delete(0,5));
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(0);
        stringBuilder.replace(7,13,"non");

        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder);


        StringBuilder stringBuilder1 = new StringBuilder("123");
        StringBuilder stringBuilder2 = new StringBuilder("123");
        System.out.println(stringBuilder1.toString().equals(stringBuilder2.toString()));




    }
}
