package HW.comparator;

public class Persons implements Comparable<Persons> {
    private int age;
    private String name;

    public Persons(int age, String name) {
        this.age = age;
        this.name = name;
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

    @Override
    public String toString() {
        return "Persons{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persons o) {
        int result = Integer.compare(this.age, o.age);
        if (result == 0) {
            int result2 = Integer.compare(this.age, o.age);
            if (result2 == 0) {
                return this.name.compareTo(o.name);
            } else {
                return result2;
            }
        }
        return result;
    }
}
