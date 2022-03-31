package firststate.day04.homework;

import java.util.Scanner;

public class DaysOfTheMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入year: ");
        int year = scanner.nextInt();
        System.out.println("请输入month：");
        int month = scanner.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(year + "年" + month + "月" + "有31天");
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "年" + month + "月" + "有29天");
            } else {
                System.out.println(year + "年" + month + "月" + "有28天");
            }
        } else {
            System.out.println(year + "年" + month + "月" + "有30天");
        }
    }
}
