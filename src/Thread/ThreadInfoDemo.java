package Thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread mian = Thread.currentThread();
        String name = mian.getName();
        System.out.println(name);
        long id = mian.getId();//获取线程的唯一标识
        System.out.println(id);

        int priority = mian.getPriority();//优先级
        System.out.println(priority);

        boolean alive = mian.isAlive();//是否活着
        boolean daemon = mian.isDaemon();//是否为守护线程
        boolean interrupted = mian.isInterrupted();//是否被中断
        System.out.println(alive+""+daemon+interrupted);
    }
}
