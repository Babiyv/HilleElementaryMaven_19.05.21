package lesson4.classwork.ex001;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(55);

        // Тема: Итератор;
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            int arr = iterator.next();
            System.out.println(arr);
        }

        // _____________________________________
        List list = new ArrayList<>(); // - неправильная запись без дженериков, потому что непонятные тип принимаемых данных и можно класть туда все подряд (int-ы со String-ами);
        list.add("hello");

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.addAll(list);

        System.out.println(list1.get(1));

        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(5);
        arrayList2.add(10);

        arrayList2 = new LinkedList<>(arrayList2);
        System.out.println(arrayList2);
        // ____________________________________________

        ArrayList<String> stringArrayList = new ArrayList<>(10000); // capacity - общий размер;
        System.out.println(stringArrayList.size()); // - size - количество значений внутри;

        stringArrayList.add("one");
        stringArrayList.add("two");

        stringArrayList.trimToSize(); // - обрезает capacity до фактического size;
        System.out.println(stringArrayList.size());

        System.out.println(stringArrayList.indexOf("two"));

        // _______________________________________________

        // Queue<>

        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.offer(10);





    }
}
