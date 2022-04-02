package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
* 集合只能保存引用类型的数组，并且保存的是元素的引用（地址）
* */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
//        c.add(new Point(1,2));
        Point p = new Point(1, 2);
        c.add(p);

        System.out.println("p"+p);
        System.out.println("c"+c);

        p.setX(2);
        p.setY(8);
        System.out.println("p"+p);
        System.out.println("c"+c);


    }
}
