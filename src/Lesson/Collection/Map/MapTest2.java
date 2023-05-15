package Lesson.Collection.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        String[] arr = {"Сапоги", "Куртка", "Сапоги", "ШАпка", "Куртка"};
        Map<String,Integer> map = countValues(arr);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    public static <V> Map<V, Integer> countValues(V[] array) {
        Map<V, Integer> mapList = new HashMap<>();
        for (V v : array) {
            if (mapList.containsKey(v)) {
                mapList.put(v, mapList.get(v) + 1);

            } else {
                mapList.put(v, 1);
            }
        }
        return mapList;
    }
}
