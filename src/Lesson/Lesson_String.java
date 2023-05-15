package Lesson;

public class Lesson_String {
    public static void main(String[] args) {

        String str = "Hello Anna how are you Anna";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        //subString
        System.out.println(str.substring(6,11));

        System.out.println("Hello".equalsIgnoreCase("hello"));

        var str2 = "  Hello ".concat( "123");
        //удаляет в начале строки
        System.out.println(str2.stripLeading());
        //удаляет пробелы в конце строки
        System.out.println(str2.stripTrailing());

        System.out.println(str.contains("Anna "));
        //проверят начинается или заканчивается наша строка с определнного символа
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("Oz"));
        //replace заменяет подстроку на др подстроку
        System.out.println(str.replace("Anna","Sofia"));
        //str = str.replace("Anna","Sofia");
        System.out.println(str);
        System.out.println(" ".isEmpty());
        System.out.println("    ".isBlank());

    }

}
