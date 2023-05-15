package HW.myexeption;

import java.util.Scanner;

public class BotGPX {
    private Scanner scanner = new Scanner(System.in);
    public void start(){
        System.out.println("введите ваш вопрос");
        String ans = scanner.nextLine();

        if (ans.trim().equalsIgnoreCase("взлом")){
            try {
                throw new IncorrectCommandExeption();
            } catch (IncorrectCommandExeption e) {
                e.printStackTrace();
            }
        }
        System.out.println("запрос принят");

    }

    @Override
    public String toString() {
        return "BotGPX";

    }
}
