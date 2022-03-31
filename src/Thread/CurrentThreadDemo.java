package Thread;

/*
* Java中所有的代码都是靠线程运行的，main方法也不例外。
* Java程序跑起来后，JVM会创建一条线程来执行main方法，这个线程的名字也叫”main"
* 我们通常称呼它为“主线程”。
*
* */
public class CurrentThreadDemo {
    public static void main(String[] args) {
//        Thread main = Thread.currentThread();//用于获取执行当前方法的线程
//        System.out.println("主线程："+main);
        System.out.println(Thread.currentThread());
        doSome();
    }

    public static void doSome(){
        System.out.println("执行doSome方法的线程是："+Thread.currentThread());
    }
}
