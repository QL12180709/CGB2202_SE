package day04;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");// \t------>水平制表位，8位
                if (i == j) {
                    System.out.println();
                }
            }
        }
    }
}
