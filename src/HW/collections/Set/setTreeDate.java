package HW.collections.Set;


import java.util.*;

public class setTreeDate {
    private Scanner scanner = new Scanner(System.in);
    SortedSet<User> userDates = new TreeSet<>();

    public static void main(String[] args) {
        setTreeDate setTreeDate = new setTreeDate();
        setTreeDate.startTree();

    }

    public void startTree() {
        System.out.println("1.Добавляем данные через TreeSet:");
        System.out.println("2.Выведем список TreeSet:");
        String answer = scanner.nextLine();
        switch (answer) {
            case "1" -> {
                treeSetDate();
                startTree();
            }
            case "2" -> {
                treeSetDateTree();

            }
        }

    }

    public void treeSetDate() {

        System.out.println("Введите пароль");
        String pass = scanner.nextLine();
        System.out.println("Введите логин");
        String log = scanner.nextLine();
        User user = new User(pass, log);
        userDates.add(user);

    }

    public void treeSetDateTree() {
        for (User userTree : userDates) {
            System.out.println(userTree);
        }
    }
}