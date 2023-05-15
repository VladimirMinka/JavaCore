package Lesson.toObject;

import java.util.Objects;

public class Student implements Cloneable {
    private String name;
    private int group;
    private PenclCase penclCase;

    public PenclCase getPenclCase() {
        return penclCase;
    }

    public Student(String name, int group, String namePanclCase) {
        this.name = name;
        this.group = group;
        this.penclCase = new PenclCase(namePanclCase);
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
        return name + ", group=" + group  + " " + penclCase.namePanclCase;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group && Objects.equals(name, student.name) && Objects.equals(penclCase, student.penclCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, penclCase);
    }

    class PenclCase {
        private String namePanclCase;

        public String getNamePanclCase() {
            return namePanclCase;
        }

        public void setNamePanclCase(String namePanclCase) {
            this.namePanclCase = namePanclCase;
        }

        public PenclCase(String namePanclCase) {
            this.namePanclCase = namePanclCase;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PenclCase penclCase = (PenclCase) o;
            return Objects.equals(namePanclCase, penclCase.namePanclCase);
        }

        @Override
        public int hashCode() {
            return Objects.hash(namePanclCase);
        }


    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Student(name,group,penclCase.namePanclCase);
    }

}
