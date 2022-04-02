package Thread;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    System.out.println("min");

                }
            }
        };
        Thread norm = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    System.out.println("norm");

                }
            }
        };
        Thread max = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    System.out.println("max");

                }
            }
        };

        min.setPriority(Thread.MIN_PRIORITY);
        norm.setPriority(5);
        max.setPriority(Thread.MAX_PRIORITY);
        min.start();
        norm.start();
        max.start();
    }
}
