package day04;

import java.util.Scanner;

//猜数字小游戏
public class Guessing {
    public static void main(String[] args) {
        System.out.println("猜数小游戏");
//        System.out.print("猜吧：");
        Scanner scanner = new Scanner(System.in);

        int num =(int)(Math.random()*1000+1);
        System.out.println(num);
        int guess;
        do {
            System.out.println("猜吧");
            guess=scanner.nextInt();
            if (guess>num){
                System.out.println("太大了");
            }else if (guess<num){
                System.out.println("太小了");
            }else {
                System.out.println("猜对了");
            }
        }while (guess!=num);

















       /* while (num!=-1){
            Scanner scanner = new Scanner(System.in);

            int guess = scanner.nextInt();
            if (guess==num){
                System.out.println("猜对了");
                break;
            }else if (guess>num){
                System.out.println("太大了");
                System.out.println("重新猜：");

            }else {
                System.out.println("太小了");
                System.out.println("重新猜：");

            }
        }*/



        /*Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        while (guess != num) {
            if (guess < num) {
                System.out.println("太小了");
            } else {
                System.out.println("太大了");
            }
            System.out.print("重新猜：");
            guess=scanner.nextInt();
        }
//       if (guess==num){
            System.out.println("猜对了");
//        }
*/
    }
}
