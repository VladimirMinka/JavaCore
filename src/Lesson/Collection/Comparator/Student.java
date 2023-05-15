package Lesson.Collection.Comparator;

public class Student implements Comparable<Student> {
    private int age;
    private String name;
    private int group;

    @Override
    public int compareTo(Student o) {
        //return this.name.compareTo(o.name);
        int result = Integer.compare(this.group, o.group);
        if (result == 0) {
            int result2 = Integer.compare(this.age, o.age);
            if (result2 == 0) {
                return this.name.compareTo(o.name);
            } else {
                return result2;
            }
        } else {
            return result;
        }
        //return Integer.compare(this.age,o.age);
    }

    public Student(int age, String name, int group) {
        this.age = age;
        this.name = name;
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", group=" + group +
                '}';
    }
}
