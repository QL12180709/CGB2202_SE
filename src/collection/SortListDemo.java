package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * 对List集合进行自然排序
 *
 * java.util.Collection是集合的工具类，其提供了很多静态方法来操作集合，其中sort方法可以对
 * List集合进行自然排序
 * */
public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list);//排序
        System.out.println(list);

        Collections.shuffle(list);//乱序
        System.out.println(list);
    }
}


