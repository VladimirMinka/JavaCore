package Lesson.Comparator;

public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private int zp;

    public Employee(String name, int age, int zp) {
        this.name = name;
        this.age = age;
        this.zp = zp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getZp() {
        return zp;
    }

    public void setZp(int zp) {
        this.zp = zp;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.zp,o.zp);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", zp=" + zp ;
    }
}
