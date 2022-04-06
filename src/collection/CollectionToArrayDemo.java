package collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * 集合转换数组
 *
 * Collection 上定义了一个方法：toArray可以将当前集合装换为数组
 *
 * */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        // 转换为数组
//        Object[] objects = list.toArray();
//        System.out.println(Arrays.toString(objects));//[one, two, three, four, five]
//        String[] array = list.toArray(new String[list.size()]);//

        /*
        * toArray方法传入数组长度实际没有要求，
        *
        * */
        String[] array = list.toArray(new String[0]);
        /*for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
        System.out.println(Arrays.toString(array));
    }
}
