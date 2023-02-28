package Home_Work.inheritance;

public class Human {
    final int ID = 1;

    public static void main(String[] args) {
        Human human = new Human();
        human.hello();

    }


    public final void hello() {
        System.out.println("Привет");

    }
}