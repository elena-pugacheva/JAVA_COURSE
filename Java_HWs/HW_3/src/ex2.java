/*Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()*/

import java.util.ArrayList;
import java.util.Collections;

public class ex2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(8);
        list.add(2);
        list.add(15);

        int min = Collections.min(list);
        int max = Collections.max(list);
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        double average = sum / list.size();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
