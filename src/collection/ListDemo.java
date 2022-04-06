package collection;

/*
* List集合
* List集合继承自Collertion,是可以存放重复元素且有序的集合
* 常用实现类：
* java.util.ArrayList:内部使用数组实现，查询性能更好
* java.util.LinkList:内部使用链表实现，增删性能更好，首尾增删性能最佳
* 在对性能没有特别苛刻的情况下使用ArrayList即可。
*
* */


import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        //获取集合中第三个元素
        System.out.println(list.get(2));

        //遍历集合
        for (String s : list) {
            System.out.println(s);
        }


        //将给定元素设置到指定位置，返回值为被替换的元素
//        System.out.println(list.set(2, "three2"));

        //list反转
//        Collections.reverse(list);
        for (int i = 0; i < list.size()/2; i++) {
            String s = list.get(i);//获取正数位置的元素
            //将正数位置上的元素放到倒数位置上并接收被替换的倒数位置上的元素
             s = list.set(list.size() - 1 - i, s);
            //将倒数位置上的元素放到正数位置上
            list.set(i,s);
        }
            System.out.println(list);

    }




}
