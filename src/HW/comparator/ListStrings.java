package HW.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ListStrings {

    //ДЗ 3
    public static void main(String[] args) {
        ArrayList<StrList> listString = new ArrayList<>();
        listString.add(new StrList("Moscow"));
        listString.add(new StrList("Rostov"));
        listString.add(new StrList("Apple"));
        listString.add(new StrList("Banan"));
        listString.add(new StrList("Vladivostok"));
        listString.add(new StrList("Vladikavkaz"));
        listString.add(new StrList("Novosibirsk"));
        listString.add(new StrList("Magadan"));
        Collections.sort(listString);
        for (StrList str : listString) {
            System.out.println(str);
        }
    }
}
