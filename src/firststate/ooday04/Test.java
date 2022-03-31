package firststate.ooday04;

public class Test {
    public static void main(String[] args) {
        Student[] stus = new Student[3];
        stus[0] = new Student("张三", 25, "廊坊", 100001);
        stus[1] = new Student("李四", 26, "佳木斯", 100002);
        stus[2] = new Student("王五", 27, "昆明", 100002);
        System.out.println("学生：");
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].name);
            stus[i].sayHi();
        }

        Teacher[] tes = new Teacher[3];
        tes[0] = new Teacher("李老师", 35, "曲靖", 5000);
        tes[1] = new Teacher("王老师", 36, "昆明", 6000);
        tes[2] = new Teacher("朱老师", 45, "成都", 8000);
        System.out.println();
        System.out.println("老师：");
        for (int i = 0; i < tes.length; i++) {
            System.out.println(tes[i].name);
            tes[i].sayHi();
        }

        Doctor[] docs = new Doctor[2];
        docs[0] = new Doctor("王医生", 41, "昆明", "主任医师");
        docs[1] = new Doctor("龙医生", 38, "曲靖", "副主任医师");
        System.out.println();
        System.out.println("医生：");
        for (int i = 0; i < docs.length; i++) {
            System.out.println(docs[i].name);
            docs[i].sayHi();
        }

    }
}
