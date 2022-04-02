package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add(new Point(1, 2));
        c.add(new Point(3, 4));
        c.add(new Point(5, 6));
        c.add(new Point(7, 8));
        c.add(new Point(9, 0));
        Point point1 = new Point(1, 2);
        c.add(point1);

        System.out.println(c);
        Point point = new Point(1, 2);
        System.out.println(c.contains(point));
        c.remove(point);
        System.out.println(c);
        System.out.println(c);
    }

}
