package firststate.day05;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sumScore = 0;
        double[] scores = new double[10];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生成绩:");
            scores[i] = scan.nextDouble();
//            sumScore += scores[i];
            /*总分、平均分、最大值、最小值、总个数-----------》统计学内容
            * 统计学内容--------要求：一定是所有数据都填充完之后再进行*/
        }
        double maxScore=0,minScore,temp=0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个学生成绩为： " + scores[i]);
            sumScore += scores[i];
            if (temp>scores[i]){
                 maxScore=temp;
            }else {
                maxScore=scores[i];
            }
        }
        double avgScore = sumScore / scores.length;
        System.out.println("学生总成绩为： " + sumScore);
        System.out.println("学生平均成绩为： " + avgScore);
        System.out.println("max"+maxScore);
    }
}
