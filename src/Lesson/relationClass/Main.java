package Lesson.relationClass;

public class Main {

    public static void main(String[] args) {
       // Motor motor = new Motor(150);


        Machine machine1 = new Machine(150);
        machine1.getMotor().setLs(0);

        Machine machine2 = new Machine(100);


        System.out.println(machine1.getMotor().getLs());
        System.out.println(machine2.getMotor().getLs());
    }
}
