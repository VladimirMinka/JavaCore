package Lesson.typeClass.localClass;

public class Apple {
    String name;
    int cost;

    public Apple(String name, int cost) {

        this.name = name;
        this.cost = cost;
    }

    {
       // System.out.println("блок инициализации");
    }

    static {
      //  System.out.println("статический блоки ");
    }

    @Override
    public String toString() {
        return "name='" + name +" cost=" + cost;
    }
}
