package collection;

/*
 * 集合之间的操作
 *  */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        c1.add("android");
        c1.add("ios");

        System.out.println("c1" + c1);

        Collection c2 = new HashSet();

        c2.add("ios");
        c2.add("android");


        System.out.println("c2" + c2);

//        c1.addAll(c2);
        System.out.println("c1" + c1);

        c2.addAll(c1);
        System.out.println("c2" + c2);

        Collection c3 = new ArrayList();
        c3.add("java");
        c3.add("c++");
//        c3.add("php"); // false

        /*boolean contains = c2.containsAll(c3);//包含所有
        System.out.println("包含所有：" + contains);

        c2.retainAll(c3);//取交集
        System.out.println("包含所有"+contains);
        System.out.println("c2:"+c2);
        System.out.println("c3:"+c3);*/

        boolean b = c2.removeAll(c3);// 删交集
        System.out.println("c2：" + c2);
        System.out.println("c3:" + c3);
    }
}
