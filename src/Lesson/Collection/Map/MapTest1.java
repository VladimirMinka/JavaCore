package Lesson.Collection.Map;

import java.util.*;

public class MapTest1 {
    public static void main(String[] args) {
        Map<Integer, String> mapList = new LinkedHashMap<>();
        Map<Integer, String> mapList2 = new HashMap<>();
        Map<Integer, String> mapList3 = new TreeMap<>();
        mapList.put(3, "Sergey");
        mapList.put(2, "Ann");
        mapList.put(1, "Vera");

        mapList2.put(3, "Sergey");
        mapList2.put(2, "Ann");
        mapList2.put(1, "Vera");

        mapList3.put(3, "Sergey");
        mapList3.put(2, "Ann");
        mapList3.put(1, "Vera");

        mapList.put(3, "Serg");
        mapList.remove(3);
        System.out.println(mapList.containsKey(1));
        System.out.println(mapList.containsValue("Ann"));
        //size` длина коллекция
        // isEmpty пустая/не пустая колелкция


        System.out.println(mapList);
        System.out.println(mapList2);
        System.out.println(mapList3);

        Set<Integer> keys = mapList.keySet();
        for (Integer key : keys) {
            System.out.println(key + " key");
        }

        Collection<String> str = mapList.values();
        System.out.println(str);
        System.out.println(mapList.get(3));

        Set<Map.Entry<Integer, String>> setE = mapList.entrySet();
        mapList.put(6, "qwe");
        mapList.put(5, "qwe2");
        mapList.put(4, "qwe3");


        for (Map.Entry<Integer, String> entry : setE) {
            if (entry.getKey() >= 5)
                System.out.println(entry.getKey() + "Больше 5" + entry.getValue());
        }


//        Map<String,String> mapList5 = new HashMap<>();
//        mapList5.put("Tula","0");
//        mapList5.put("Kaluga","10");
//
//
//        Map<String, String> mapList4 = new HashMap<>(100);
//        mapList4.put("Omsk","10000");
//        mapList4.put("Rostov","20000");
//        mapList4.put("Tula","5000");
//        mapList4.putIfAbsent("Rostov","30000");
//        mapList4.putAll(mapList5);
//
//        for (Map.Entry<String, String> entry : mapList4.entrySet()) {
//            System.out.println(entry);
//        }
//        System.out.println(mapList5.getOrDefault(10,"not key"));
        //clear

    }
}
