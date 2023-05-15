package HW.relation;

import HW.poliphormism.Electro;

public class Main {
    //создать программу в которой есть след отношения между классаим
    //
    //класс Человек класс воин - IS a
    //класс Человек класс мечь - HAS - a агрегация
    //класс Человек класс мечь - HAS - a композиция
    //
    //создать объекты через маин
    public static void main(String[] args) {
        Sword sword = new Sword("Шашка");
        Warrior warrior = new Warrior("мужчина", 35, "Морская пехота", "сержант",sword);
        Elf elf = new Elf("M",22);
        elf.hello();


        System.out.println("Род войск: " + warrior.troops);
        System.out.println("Звание: " + warrior.title);

        Human.f1();
        System.out.println(Hero.info);
        elf.heroInfo();






    }
}
