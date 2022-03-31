package firststate.day06;

public class Test {
    public static void main(String[] args) {
        say();

        sayHi("LXR");

        sayHello("ZhangSan", 25);
        sayHello("LiSi", 65);

        double num = getNum();
        System.out.println(num);

        int sum = plus(6, 5);
        System.out.println("sum=" + sum);

        int[] arr = testArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

        int[] arr1 = {60, 40, 50, 20, 10};
        int min = getMinOfArray(arr1);
        System.out.println();
        System.out.println("min=" + min);

    }

    public static void say() {
        System.out.println("大家好！我是LXR,今年21岁了");
    }

    public static void sayHi(String name) {
        System.out.println("大家好！我是" + name + ",今年21岁了");
    }

    public static void sayHello(String name, int age) {
        if (age >= 35) {
            return;
        }
        System.out.println("大家好！我是" + name + ",今年" + age + "岁了");
    }

    public static double getNum() {
        return 8.88;
    }

    public static int plus(int num1, int num2) {
        int num = num1 + num2;
        return num;  //return num1+num2;
    }

    public static int[] testArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static int getMinOfArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
