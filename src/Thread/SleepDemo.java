package Thread;

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");

        try {
            for (long i = 0L; ; i++) {
                System.out.println(i);
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束了...");
    }
}
