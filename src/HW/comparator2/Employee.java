package HW.comparator2;

public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        int result = Integer.compare(this.salary, o.salary);
        if (result == 0) {
            int result2 = Integer.compare(this.salary, salary);
            if (result2 == 0) {
                return this.name.compareTo(o.name);
            } else {
                return result2;
            }
        }
        return result;
    }
}
