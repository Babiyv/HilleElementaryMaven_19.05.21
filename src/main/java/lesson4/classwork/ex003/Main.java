package lesson4.classwork.ex003;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    private static long getTimeMsOfInsert(List list){ // - специально указали List, чтобы мог принимать и ArrayList и LinkedList
        Date currentTime = new Date();
        insert10000(list);
        Date newTime = new Date();

        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is: " + msDelay + " in ms");
        return msDelay;
    }

    private static void  insert10000(List list){
        for (int i = 0; i < 10000; i++) {
            // Вставляем в начало объекты
            list.add(0, new Object());
        }
    }
}
