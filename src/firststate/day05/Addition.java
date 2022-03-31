package firststate.day05;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        for (int i = 1; i <= 10; i++) {
//     出题
            int num1 = (int) (Math.random() * 100 + 1);//1-100
            int num2 = (int) (Math.random() * 100 + 1);

//           int num1 = (int) (Math.random() * 100 );//0-99
            System.out.println("(" + i + ")" + num1 + "+" + num2 + "=?");
            System.out.println("答题吧：");
//     答题
            int answer;
            answer = num1 + num2;
            System.out.println(answer);


            System.out.println("请输入你的答案：");
            int input = scanner.nextInt();
            if (input == -1) {
                return;
            }

//     判题
            if (input == answer) {
                score += 10;
                System.out.println("答对了");
                System.out.println();
            } else {
                System.out.println("答错了");
                System.out.println();
            }

        }
        System.out.println("总分为" + score);
    }
}
