package Lesson.ClassDate;

import HW.threadsWeather.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LessonDate {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd. HH:mm:ss:Sмс E D W");
        System.out.println(simpleDateFormat.format(date));
    }
}
