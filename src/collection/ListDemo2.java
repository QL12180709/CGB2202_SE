package collection;
/*
* List集合重载了一对add和remove方法
* */

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        list.add(2,"six");
        System.out.println(list);

        String remove = list.remove(2);
        System.out.println(list);
        System.out.println("被删除的元素是："+remove);

//        boolean three = list.remove("three");
//        System.out.println(list);
    }
}
