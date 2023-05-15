package Lesson.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class TestMap2 {
    public static void main(String[] args) {
        String text = "asasa erg erg erg qargar hgrh aerh";

        for (Map.Entry<String, Integer> entry : countB(text).entrySet()) {
            System.out.println(entry.getKey() +") " + entry.getValue());
        }
    }

    public static Map<String, Integer> countB(String str) {
        Map<String, Integer> mapStr = new HashMap<>();
        String[] strings2 = str.split("");
        for (String s : strings2) {
            if (mapStr.containsKey(s)) {
                mapStr.put(s, mapStr.get(s) + 1);
            } else {
                mapStr.put(s, 1);
            }
        }
        return mapStr;

    }
}
