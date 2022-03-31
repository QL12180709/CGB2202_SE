package day05.homework;

public class PrintTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int q = 1; q <= 6 - i; q++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
