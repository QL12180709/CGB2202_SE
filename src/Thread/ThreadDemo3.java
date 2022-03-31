package Thread;

//使用匿名内部类的创建方式完成线程的两种创建形式

public class ThreadDemo3 {
    public static void main(String[] args) {
//        第一种：继承Thread重写run方法的形式
//        Thread t1=new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 10000; i++) {
//                    System.out.println(1);
//
//                }
//            }
//        };
        Thread t1= new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println(1);

            }
            System.out.println(Thread.currentThread());
        });

//         第二种：实现Runnable接口单独定义线程任务的形式
        Runnable r2= () -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println(2222222);
            }
        };
//        Runnable r2= new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10000; i++) {
//                    System.out.println(2222222);
//
//                }
//
//            }
//        };

        /*
        * 启动线程调用的是线程的start方法，不能直接调用run方法
        * start方法调用后线程会被纳入到线程调度器中被统一管理。当它第一次获取了调度器
        *  分配给它的CPU时间片后就会开始执行run方法。
        * */
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
