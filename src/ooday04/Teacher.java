package ooday04;

public class Teacher extends Person {
    int salary;

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    @Override
    void sayHi() {
        System.out.println("大家好，我叫" + name + ",今年" + age + "岁了，家住" + address + ",我的工资是" + salary);
    }
}
