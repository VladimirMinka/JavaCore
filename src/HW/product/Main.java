package HW.product;

public class Main {


    public static void main(String[] args) {
        Product milk = new Product("Milk", 1000, 100);
        Product apple = new Product("Apple", 1000, 150);
        Product water = new Product("Water", 1000, 40);
        Product ege = new Product("Ege", 10, 100);
        Product tea = new Product("Tea", 100, 300);
        Product coffee = new Product("Coffee", 1000, 2000);
        Product bread = new Product("Bread", 300, 50);
        Product oil = new Product("Oil", 200, 200);
        Product sausage = new Product("Sausage", 1000, 500);
        Product salat = new Product("Salat", 200, 300);
        if (apple.equals(water)) {
            System.out.println("Название  и вес равны");
        } else
            System.out.println("Название  и вес неравны");
        System.out.println(milk.hashCode());
        System.out.println(apple.hashCode());

        System.out.println(salat);
    }

}
