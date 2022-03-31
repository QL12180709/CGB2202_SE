package Thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        /*for (int i = 0; i < 1000; i++) {
            System.out.println("你是谁啊？");

        }

        for (int i = 0; i < 1000; i++) {
            System.out.println("“开门，查水表的！");

        }*/

        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        //启动线程
        t1.start();
        t2.start();

    }
}

/*
* 第一种创建方式
*   优点：结构简单，利于匿名内部类创建
*   缺点：1.由于Java是单继承的，这导致如果继承了Thread就无法再继承其它类了
*        2.在定义线程时定义了线程任务，这导致任务与线程存在了必然
*
*
* */

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println("你是谁啊？");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println("开门，查水表的！");
        }
    }

}
