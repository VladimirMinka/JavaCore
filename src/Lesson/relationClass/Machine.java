package Lesson.relationClass;

public class Machine {
    private Motor motor;
     public Machine(int ls){
         this.motor = new Motor(ls);
     }

    public Motor getMotor() {
        return motor;
    }
}
