package day06;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.print("原数组：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "\t");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.print("排序后的数组：\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.print("倒序输出：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr.length - 1 - i] + "\t");
        }
    }
}
