package HW.mySecondExeption;

public class myExeption extends Exception {
    private String message = "Error";

    @Override
    public String toString() {
        return message;
    }
}