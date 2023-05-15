package HW.Collections.Map;

import java.util.*;

public class MapMethods {
    public static void main(String[] args) {
        //1   Напишите метод который принмиает на вход MAP с оценаками студентов  и возвращает список студентов,
        //        у которых средний бал выше 4
        Map<String, Integer> dateStudent = new HashMap<>();
        dateStudent.put("V", 5);
        dateStudent.put("K", 4);
        dateStudent.put("L", 3);
        System.out.println(getListStudent(dateStudent, 5));
        //2
        Map<Integer, String> info = new HashMap<>();
        info.put(100, "LargeWarehouse");
        info.put(50, "MediumWareHouse");
        info.put(10, "SmallWareHouse");
        Set<Integer> values = info.keySet();
        System.out.println(values);
        for (Map.Entry<Integer, String> item : info.entrySet()) {
            System.out.println(item.getKey());
        }
        //3. Напишите метод который принмиает на вход MAP c с ценами товаров и возвращает список товаров,
        // стоимость которых не превышает заданную
        Map<String, Integer> listProduct = new HashMap<>();
        listProduct.put("Milk", 80);
        listProduct.put("Butter", 180);
        listProduct.put("Apple", 110);
        listProduct.put("Water", 105);
        listProduct.put("Banana", 100);
        listProduct.put("Сhocolate", 50);

        System.out.println("список продуктов не дороже 100 р" + getListProducts(listProduct, 100));
    }

    //1
    public static List<String> getListStudent(Map<String, Integer> st, int middle) {
        List<String> arrayList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : st.entrySet()) {
            if (entry.getValue() >= middle) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    //3
    public static List<String> getListProducts(Map<String, Integer> price, int priceProduct) {
        List<String> arrayListProduct = new ArrayList<>();
        for (Map.Entry<String, Integer> en : price.entrySet()) {
            if (en.getValue() <= priceProduct) {
                arrayListProduct.add(en.getKey());
            }
        }
        return arrayListProduct;

    }
}



