package Lesson.synchronized2;

import java.util.Arrays;

public class DataBase {
    private String[] arr = new String[20];

    public  void enterStr(String str) {
        for (int a = 0; a < arr.length; a++) {
                if (arr[a] == null) {
                    arr[a] = str;
                }
                try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Arrays.toString(arr));

        }
        clear();

    }

    public synchronized void clear(){
        arr =new String[arr.length];
    }

}
