package Lesson.toObject;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Vova", 1,"SFS");

        Student student2 = new Student("Vova", 1,"Aza");
        Student student3 = null;
        try {
            student3= (Student) student2.clone();
        } catch (CloneNotSupportedException e){

        }


        student2.setName("Dima");
        student2.getPenclCase().setNamePanclCase("OLO");
        System.out.println(student2);

        System.out.println(student3);

        if (student.getClass().equals(student2.getClass())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(student.equals(student2));


        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());


    }
}
