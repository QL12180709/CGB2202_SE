package Thread;

public class SyncDemo3 {
    public static void main(String[] args) {
        /*Boo boo1 = new Boo();
        Boo boo2=new Boo();*/
        Thread t1 = new Thread() {
            @Override
            public void run() {
                Boo.dosome();
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                Boo.dosome();
            }
        };

        t1.start();
        t2.start();
    }
}

class Boo {
    public static void dosome() {
        synchronized (Boo.class) {
            try {
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName() + "正在执行方法");
                Thread.sleep(5000);
                System.out.println(thread.getName() + "正在执行方法");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
