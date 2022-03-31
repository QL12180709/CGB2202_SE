package day06;

public class MathodDemo {
    public static void main(String[] args) {
        String kkk = sayHi("kkk", 22);
        System.out.println(kkk);

        /*int i=0;
        i=i++;
        System.out.println("i="+i);*/

        int[] a = testArray();
        System.out.println("a.length=" + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static String sayHi(String name, int age) {
        return "我叫" + name + ",今年" + age + "岁了";
    }

    public static int[] testArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
