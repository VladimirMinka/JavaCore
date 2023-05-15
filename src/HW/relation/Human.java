package HW.relation;

public  abstract class Human implements Hero {
    String sex;
    int age;
    Sword sword;


    public Human(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public void hello(){
        System.out.println("Hello");
    }

    public abstract int getWeight();

    public  static void f1(){
        System.out.println("f1");
    }


}
