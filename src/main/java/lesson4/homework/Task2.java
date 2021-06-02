package lesson4.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*Написать класс где будут методы добавления элементов в середину коллекции и в конец коллекции,
посчитать время выполнения программы при добавлении 10000 обьектов в ArrayList и в LinkedList*/
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // вставка по элементам по индеску (каждый новый элемент вставляется в середину коллекий на текущий момент):
        System.out.println("Time of insert 10000 objects in the middle of the arrayList by index is: " + getTimeOfInsertByIndexInTheMiddle(arrayList));
        System.out.println("Time of insert 10000 objects in the middle of the linkedList by index is: " + getTimeOfInsertByIndexInTheMiddle(linkedList));

        arrayList.clear();
        linkedList.clear();

        // вставка блоком по индексу:
        System.out.println("Time of insert 10000 objects in the middle of the arrayList by index is: " + getTimeOfInsertByIndexInTheMiddle2(arrayList));
        System.out.println("Time of insert 10000 objects in the middle of the linkedList by index is: " + getTimeOfInsertByIndexInTheMiddle2(linkedList));

        arrayList.clear();
        linkedList.clear();

        // вставка блоком (определяется текущая середина списка и вставляются все элемент как один блок: 0, 1, 2, 3, 0, 1, 2, ..., 9999, 4, 5, 6, 7):
        System.out.println("Time of insert 10000 objects in the middle of the arrayList by iterator is: " + getTimeOfInsertByIteratorInTheMiddle(arrayList));
        System.out.println("Time of insert 10000 objects in the middle of the linkedList by iterator is: " + getTimeOfInsertByIteratorInTheMiddle(linkedList));

        arrayList.clear();
        linkedList.clear();

        // для вставки в конец нет необзодимости использовать .addLast, можно просто .add:
        System.out.println("Time of insert 10000 objects in the end of the arrayList is: " + getTimeOfInsertInTheEnd(arrayList));
        System.out.println("Time of insert 10000 objects in the end of the linkedList is: " + getTimeOfInsertInTheEnd(linkedList));
    }

    private static long getTimeOfInsertByIteratorInTheMiddle(List list) {
        Date startTime = new Date();
        addInTheMiddleByIterator(list);
        Date finishTime = new Date();
        return finishTime.getTime() - startTime.getTime();
    }

    private static void addInTheMiddleByIterator(List list) {
        ListIterator li = list.listIterator(list.size() / 2);
        for (int i = 0; i < 10000; i++) {
            li.add(new Object());
        }
    }

    private static long getTimeOfInsertInTheEnd(List list) {
        Date startTime = new Date();
        addInTheEnd(list);
        Date finishTime = new Date();
        return finishTime.getTime() - startTime.getTime();
    }

    private static long getTimeOfInsertByIndexInTheMiddle(List list) {
        Date startTime = new Date();
        addInTheMiddle(list);
        Date finishTime = new Date();
        return finishTime.getTime() - startTime.getTime();
    }

    private static long getTimeOfInsertByIndexInTheMiddle2(List list) {
        Date startTime = new Date();
        addInTheMiddle2(list);
        Date finishTime = new Date();
        return finishTime.getTime() - startTime.getTime();
    }

    private static void addInTheEnd(List list) {
        for (int i = 0; i < 10000; i++) {
            // для вставки в конец нет необходимости использовать .addLast, можно просто .add:
            list.add(new Object());
        }
    }

    private static void addInTheMiddle(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(list.size() / 2, new Object());
        }
    }

    private static void addInTheMiddle2(List list) {
        int ls = list.size() / 2;
        for (int i = 0; i < 10000; i++) {
            list.add(ls, new Object());
        }
    }
}