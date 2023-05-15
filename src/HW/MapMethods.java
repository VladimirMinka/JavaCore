package HW;

import java.util.*;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, Integer> dateStudent = new HashMap<>();

        dateStudent = new HashMap<>();
        dateStudent.put("V", 5);
        dateStudent.put("K", 4);
        dateStudent.put("L", 3);
        System.out.println(getListStudent(dateStudent,5));

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
    }

    //3
    public static List<String> getListStudent(Map<String, Integer> price, int middle) {
        List<String> arrayList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : price.entrySet()) {
            if (entry.getValue() >= middle) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }
}



