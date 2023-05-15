package HW.dateCalendar;

import java.util.Calendar;

import java.time.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //ДЗ 1 кол-во дней до  конца года
        Calendar calendar = Calendar.getInstance();
        int daysInYear = 366;
        //System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        int result = daysInYear - calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("Осталось дней до конца Года: " + result);
        //ДЗ 3 кол-во часов до конца Года
        int hour = 24;
        int result2 = result * hour;
        System.out.println("Осталось часов до конца Года" + " " + (result2 + calendar.get(Calendar.HOUR_OF_DAY)));
    }
}