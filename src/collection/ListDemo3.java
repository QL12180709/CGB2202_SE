package collection;

import java.util.LinkedList;
import java.util.List;

/*
 * List subList(int start ,int end)
 * 获取指定范围内的子集
 *
 * */
public class ListDemo3 {
    public static void main(String[] args) {
        /*List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        List<String> list1 = list.subList(1, 3);//获取指定范围内的子集,包含start,不包含end
        System.out.println(list1);  // [two, three]*/
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);   //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        List<Integer> list1 = list.subList(3, 8);    //获取指定范围内的子集,包含start,不包含end,截取的是原集合的一部分，不是拷贝，不是一个新的集合，所以原集合的元素不会变。
        System.out.println(list1); // [3, 4, 5, 6, 7]

        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i) * 10);
        }
        System.out.println(list1); // [30, 40, 50, 60, 70]


        System.out.println(list); // [0, 1, 2, 30, 40, 50, 60, 70, 8, 9]
        list.subList(2, 9).clear();
        System.out.println(list); // [0, 1, 9]




    }
}
