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
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
