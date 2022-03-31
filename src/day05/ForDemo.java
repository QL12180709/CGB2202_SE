package day05;

public class ForDemo {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("行动是成功的阶梯！");
//        }
//
        for (int i = 1; i <= 9; i++) {
//            if (i == 4) {
//                break;
//            }
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i + "*9=" + i * 9);
        }

        for (int i = 1; i <=9; i++) {
            if (i % 3 != 0) {
                System.out.println(i + "*9=" + i * 9);

            }
        }
//
//        for (int i = 1; i <= 9; i += 2) {
//            System.out.println(i + "*9=" + i * 9);
//        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + j * i);
                System.out.print(" ");
                if (i == j) {
                    System.out.println();
                }
            }
        }
    }
}
