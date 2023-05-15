package HW.myexeption;

public class IncorrectCommandExeption extends Exception{
    private String message = "incorrectEnter";

    @Override
    public String toString() {
        return message;
    }
}
