package HW.Triple;

public class Main {
    public static void main(String[] args) {

        Triple tr1 = new Triple("Petrov", 5000, "Ivan");
        Triple tr2 = new Triple(53757, 4000, "Vasya");
        System.out.println(tr1.getId());
        System.out.println(tr2.getId());
        System.out.println(tr1.getName());
    }
}