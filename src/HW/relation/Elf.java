package HW.relation;

public class Elf extends Human{
   Sword sword;
    public Elf(String sex, int age) {
        super(sex, age);
        this.sword = new Sword("a grade");
    }

    @Override
    public int getWeight() {
        return 50;
    }

    @Override
    public void f2() {

    }
}
