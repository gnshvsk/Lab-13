package org;

import java.util.*;

public class Average {
    int average1 = 0, average2 =0;
    int size = 3;
    public void Calculating( List<ArrayList<Integer>> a){

        for (int i = 0; i < size; ++i) {
            average1 += a.get(i).get(i);            //суммирование значений главной диагонали
            average2 += a.get(size - 1 - i).get(i); //суммирование значений побочной диагонали
        }
        average1 /= size;                           //присваивание переменной среднего арифметического значения главной диагонали
        average2 /= size;                           //присваивание переменной среднего арифметического значения побочной диагонали
        System.out.println("Среднее арифметическое главной диагонали: " + average1);
        System.out.println("Среднее арифметическое побочной диагонали: " + average2);
        System.out.println("Наибольшее значение записываем в середину матрицы: ");
        if (average1 > average2) {
            a.get((int) Math.ceil(size / 2)).set((int) Math.ceil(size / 2), average1);
        } else {                                                                        //сравнение средних арифм.значений и запись большего в середину матрицы
            a.get((int) Math.ceil(size / 2)).set((int) Math.ceil(size / 2), average2);
        }
        for (ArrayList obj : a) {                   //вывод на экран полученной матрицы

            ArrayList<Integer> temp = obj;

            for (Integer job : temp) {
                System.out.print(job + " ");
            }
            System.out.println();
        }
    }
}
