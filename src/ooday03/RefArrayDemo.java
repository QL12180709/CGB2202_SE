package ooday03;

import java.awt.peer.PanelPeer;

public class RefArrayDemo {
    public static void main(String[] args) {
        Student[] stus = new Student[3];
        stus[0]=new Student("Zhangsan",25,"LF");
        stus[1]=new Student("lisi",34,"JMS");
        stus[2]=new Student("lx",35, "KK");
        System.out.println(stus[1].name);
        stus[1].sayHi();
        stus[1].age=33;
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].name);
            System.out.println(stus[i].age);
        }
    }
}
