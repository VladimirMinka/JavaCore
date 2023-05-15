package Lesson.ClassDate;

import java.util.Calendar;

public class LessonCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));
    }
}
