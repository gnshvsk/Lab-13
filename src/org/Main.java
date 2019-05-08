package org;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        List<ArrayList<Integer>> a = new ArrayList<>();

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();

        a1.add(2);
        a1.add(0);
        a1.add(9);
        a2.add(5);
        a2.add(4);              //заполнение матрицы элементами
        a2.add(1);
        a3.add(6);
        a3.add(8);
        a3.add(3);

        a.add(a1);
        a.add(a2);
        a.add(a3);

        for (ArrayList obj : a) {           //вывод на экран исходной матрицы
            ArrayList<Integer> temp = obj;
            for (Integer job : temp) {
                System.out.print(job + " ");
            }
            System.out.println();
        }

        Average myMatrix = new Average();
        myMatrix.Calculating(a);

    }
}