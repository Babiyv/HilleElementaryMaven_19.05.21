package lesson3.BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // Создаем объект ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Создаем объект BufferedReader, для дальнейшего ввода с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Циклом заполняем коллекцию arrayList значеиями с клавиатуры
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите значение [" + (i + 1) + "]");
            String s = reader.readLine();
            // Добавляем значение в конец массива
            arrayList.add(s);
        }

        // Удаляем последнюю строку и добавляем ее вначало
        for (int i = 0; i < 5; i++) {
            String s1 = arrayList.remove(arrayList.size() - 1);
            arrayList.add(0, s1);
        }

        // Выводим на экран все содержимое
        for (String temp : arrayList) {
            System.out.println(temp);
        }

        // Циклом проходим по всей длине arrayList (выводим на консоль задом наперед)
        for (int i = 0; i < arrayList.size(); i++) {
            // Записываем знначение последнего элемента в переменную j
            int j = arrayList.size() - i - 1;
            // Выводим на экран содержимое j
            System.out.println(arrayList.get(j));
        }
        reader.close();
    }
}
