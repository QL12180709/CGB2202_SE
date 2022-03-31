package day06;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {10, 20, 500, 40, 50};

        int[] b = Arrays.copyOf(a, 6);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        /*//数组的复制
        int[] a = {10, 20, 500, 40, 50};


        Arrays.sort(a);
        int i1 = Arrays.binarySearch(a, 500);
        System.out.println("i1="+i1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

        int[] b = new int[6];
        int[] c = new int[6];
        int[] d = new int[6];
        int[] e = new int[6];
        int[] f = new int[6];
        System.arraycopy(a, 1, b, 0, 4);
        System.arraycopy(a,3,c,5,1);
        *//* a:原数组
         * 1：原数组的起始下标
         * b：目标数组
         * 0：目标数组的起始下标
         * 4：要复制的元素个数
         * *//*

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            System.out.println(c[i]);
        }*/
    }
}
