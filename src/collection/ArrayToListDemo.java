package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 数组转换成集合
* 数组的工具类Arrays提供了一个静态方法asList,可以将一个数组转换为一个List集合
* */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        System.out.println("array:"+ Arrays.toString(array));

        List<String> list = Arrays.asList(array);//数组转换为集合
        System.out.println("list:"+list);

        list.set(1,"sex");
        System.out.println("list:"+list);
//        对该集合的操作就是对原数组对应的操作
        System.out.println("array:"+Arrays.toString(array));

//        list.remove(2);
//        System.out.println(list);
//        会改变数组长度的操作都不支持，因为数组是定长的。//add,remove,clear...都不行
//        list.add("seven");//java.lang.UnsupportedOperationException
//        System.out.println("list:"+list);
//        System.out.println("array:"+Arrays.toString(array));

//        List<String> list2 = new ArrayList<>();
//        list2.addAll(list);

        /*
        * 所有的集合都支持一个参数为Collection的构造器，作用是在创建当前集合的同时包含给定集合中的所有元素
        * */
        List<String> list2 = new ArrayList<>(list);
        System.out.println("list2:"+list2);
        list2.add("seven");
        System.out.println("list2:"+list2);

    }
}
