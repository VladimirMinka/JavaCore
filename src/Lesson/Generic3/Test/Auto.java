package Lesson.Generic3.Test;

public  abstract class Auto<T extends Drive> {
    T drive;

    public Auto(T drive) {
        this.drive = drive;
    }
}
