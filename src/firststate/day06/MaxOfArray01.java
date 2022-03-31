package firststate.day06;

import java.util.Arrays;

//求数组元素的最大值，并将最大值放在数组最后一个元素的下一个位置
public class MaxOfArray01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);//生成0到99的随机数
            System.out.println("arr[" + i + "]=" + arr[i]);
        }

        int max = arr[0];
//        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {//遍历剩余元素
            if (arr[i] > max) {
                max = arr[i];
            }
            /*if (arr[i] < min) {
                min = arr[i];
            }*/
        }
        System.out.println("\nmax=" + max);
//        System.out.println("min=" + min);

        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = max;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }

        /*Arrays.sort(arr);
        System.out.println("升序后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" arr[i]);
        }*/

       /* for(int i:arr){
            System.out.println(i);
        }//增强for循环*/

    }
}
