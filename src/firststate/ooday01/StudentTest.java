package firststate.ooday01;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name="zs";
        student.age=20;
        student.address="昆明";
        student.study();
        student.sayHi();

        Student ls = new Student();
        ls.name="lisi";
        ls.age=25;
        ls.address="黑龙江";
        ls.study();

        Student lx = new Student();
        lx.name="龙霄";
        lx.age=22;
        lx.address="未知地";
        lx.study();
        lx.sayHi();


    }
}
