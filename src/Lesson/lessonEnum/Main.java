package Lesson.lessonEnum;

public class Main {
    public static void main(String[] args) {
     //   Colours colours = Colours.GREEN;


        Colours [] colours1 = Colours.values();
        for (Colours colours : colours1) {
            System.out.println(colours.getNameRu());
            System.out.println(colours.name());
            System.out.println(colours.ordinal());
            System.out.println("---------------");

        }
    }
}

