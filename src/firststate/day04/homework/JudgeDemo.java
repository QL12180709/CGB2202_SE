package firststate.day04.homework;

import java.util.Scanner;

public class JudgeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数： ");
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println(0);
        } else if (num < 0) {
            System.out.println("-");
        } else {
            System.out.println("+");
        }
    }
}
