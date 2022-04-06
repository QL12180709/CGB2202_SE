package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK5之后，推出了一个新的特性:
 * 增强型for循环.也称为新循环。是可以使用相同的语法遍历集合或数组。
 * 语法:
 * for(元素类型 变量名 : 集合或数组){
 * ...
 * }
 */

public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

//      增强for循环
        for (String e : array) {
            System.out.println(e);
        }

        Collection<String> c = new ArrayList<>();
//        ArrayList<Integer> objects = new ArrayList<>();//泛型：前面必须制定类型
//        objects.add(1);
//        objects.add(2);
//
//        for (Integer integer : objects){
//            System.out.println(integer);
//        }

        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
//        c.add(1);
        System.out.println(c);

        /*for (Object o : c){
            System.out.println(o);
        }*/

//        for (Object o : c) {
//            String e = (String) o;
//            System.out.println(e);
//        }
        for (String s : c) {
            System.out.println(s);
        }
//新循环会被改回迭代器模式：
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

    }
}
