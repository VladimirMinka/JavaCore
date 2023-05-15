package HW.listOrder;

public class Product {
    private String nameOrder;

    public Product(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public void info() {
        System.out.println(nameOrder);
    }
}
