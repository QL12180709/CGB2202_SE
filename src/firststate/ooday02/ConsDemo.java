package firststate.ooday02;

public class ConsDemo {
    public static void main(String[] args) {
        Student zs = new Student();
        Student ls = new Student("lisi",25,"lf");
        Student lx=new Student("lx",22,"xw");

        ls.study();
        lx.study();
    }
}
