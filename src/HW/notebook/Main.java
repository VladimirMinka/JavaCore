package HW.notebook;

public class Main {
    public static void main(String[] args) {
        /*
        написать 3 объекта ноутбука и создать их копии через метод clone()
        класс ноутбук
        с полями
        имя
        цена
        объект процессор(со свойствами герцы (это тип инт) принимаются через конструктор)
        объект оперативная память (со свойствами объем памяти (это тип int) принимаются через конструктор)
        объект видеокарта (со свойствами объем памяти (это тип int) и название принимаются через конструктор )
         */
        NoteBook macBook = new NoteBook("Mac", 100_000,1,2);
        NoteBook dell = new NoteBook("Dell", 70_000,3,4);
        NoteBook acer = new NoteBook("Acer", 70_000,5,6);
        NoteBook noteBook = new NoteBook("Null", 0,6,6);

        try {
            noteBook = (NoteBook) macBook.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }
        System.out.println(noteBook);
    }
}
