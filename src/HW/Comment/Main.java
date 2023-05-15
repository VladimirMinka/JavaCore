package HW.Comment;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getTime());
        String date = "2023.10.1 14:40:19";
        String time = String.valueOf(date.charAt(10)) + date.charAt(11);
        if(Integer.parseInt(time) < 15){
            System.out.println(" день или утро");
        }else {
            System.out.println("вечер ");
        }

    }
}
