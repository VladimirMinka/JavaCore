package HW.comparator2;


public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ListStudent{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(getGrade(), o.getGrade());
    }
}




