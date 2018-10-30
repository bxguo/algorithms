package com.jimmysun.algorithms.chapter2_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author: bxguo
 * @time: 2018/10/29 17:43
 */
public class Exo1 {
    public static void main(String[] args) {
        int[] list = new int[]{2,1,4,3,5,6};

        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[min] > list[j]){
                    min = j;
                }
            }
            exch(list,i,min);
            show(list);
        }
        //show(list);
    }


    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // does v == w ?
    private static boolean eq(Comparable v, Comparable w) {
        return v.compareTo(w) == 0;
    }

    // exchange a[i] and a[j]
    private static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i]);
        }
        System.out.println();
    }
}
