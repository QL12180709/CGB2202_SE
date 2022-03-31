package firststate.day04.homework;

public class SumDemo {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("sum="+sum);
    }
}
