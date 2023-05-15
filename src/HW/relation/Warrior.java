package HW.relation;

public class Warrior extends Human {
    //род войск
    String troops;
    //звание
    String title;
    Sword sword;

    public Warrior(String sex, int age, String troops, String title,Sword sword) {
        super(sex, age);
        this.troops = troops;
        this.title = title;
        this.sword = sword;
    }

    @Override
    public int getWeight() {
        return 80;
    }

    @Override
    public void f2() {

    }
}
