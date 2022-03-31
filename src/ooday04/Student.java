package ooday04;

public class Student extends Person {
    int stuId;

    public Student(String name, int age, String address, int stuId) {
        super(name, age, address);
        this.stuId = stuId;
    }

    @Override
    void sayHi() {
        System.out.println("大家好，我叫" + name + ",今年" + age + "岁了，家住" + address+",我的学号是"+stuId);
    }
}
