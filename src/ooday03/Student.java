package ooday03;

public class Student {
    //成员变量
    String name;
    int age;
    String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //方法
    void study(){
        System.out.println(name+"在学习...");
    }

    void sayHi(){
        System.out.println("大家好，我叫"+name+"今年"+age+"岁了,家住"+address);
    }
}
