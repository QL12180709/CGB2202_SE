package ooday04;

public class Test1 {
    public static void main(String[] args) {
        Person[] ps = new Person[8];
        ps[0] = new Student("张三", 25, "廊坊", 100001);
        ps[1] = new Student("李四", 26, "佳木斯", 100002);
        ps[2] = new Student("王五", 27, "昆明", 100002);

        ps[3] = new Teacher("李老师", 35, "曲靖", 5000);
        ps[4] = new Teacher("王老师", 36, "昆明", 6000);
        ps[5] = new Teacher("朱老师", 45, "成都", 8000);

        ps[6] = new Doctor("王医生", 41, "昆明", "主任医师");
        ps[7] = new Doctor("龙医生", 38, "曲靖", "副主任医师");

        for (int i = 0; i < ps.length; i++) {
            System.out.println(ps[i].name);

            ps[i].sayHi();
        }

    }
}
