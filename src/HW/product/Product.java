package HW.product;

import java.util.Objects;

public class Product {
    /*
    со свойствами
название
вес
цена
принимаем через конструкто
в класссе маин создать 10 разных товаров
реализовать метод euqlse и  hashCode так чтоб при сравнении товаров
выводил что товары одинаковые если их название и вес равен
так же переопределить для товаров метод toString он будет выводить имя товара и цену
     */

    private String name;
    private int weight;
    private int cost;

    public Product(String name, int weight, int cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return weight == product.weight && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "name: " + name + " " + " cost: " + cost;
    }
}
