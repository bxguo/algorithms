package com.jimmysun.algorithms.chapter2_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author: bxguo
 * @time: 2018/10/29 17:43
 */
public class Exo3 {
    public static void main(String[] args) {
        int[] list = new int[]{2,1,4,3,5,6,9,8,7,18,12,111,333,222,1,4,6,79,954,34536,324324,};
        int length = list.length;

        for (int h = length/2; h > 0 ; h /= 2) {

            for (int i = h; i < length; i += h) {

                for (int j = i; j > 0 && list[j] < list[j - h] ; j -= h) {

                    exch(list, j, j-h);
                }
            }
        }

        show(list);

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
            StdOut.print(a[i]+",");
        }
        System.out.println();
    }
}
