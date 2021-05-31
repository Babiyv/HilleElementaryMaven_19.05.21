package lesson4.classwork.ex002;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue priorityQueue = new PriorityQueue();
        priorityQueue.add(new Human("Olga"));
        priorityQueue.add(new Human("Vasya"));
        System.out.println(priorityQueue); // - выбьет эксепшен, пока не будет сортировки

    }
}

class Human implements Comparable{

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}