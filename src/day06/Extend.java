package day06;

public class Extend {
    public static void main(String[] args) {
        int a = 10, b = 3;
        int[] arr = generate(a, b);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] generate(int a, int b) {
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b + 1));
        }
        return arr;
    }
}
