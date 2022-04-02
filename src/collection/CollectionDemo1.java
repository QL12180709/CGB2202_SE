package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        boolean one = c.add("one");
        c.add("two");
        c.add(3);
        c.add(Integer.valueOf(4));
        System.out.println(c.size());
        System.out.println(c);

        System.out.println(c.isEmpty());
        System.out.println(c.contains(3));
        c.clear();
//        System.out.println("kkkkkkkk"+c==null+"");
        System.out.println(c.size());
        System.out.println(c);

    }
}
