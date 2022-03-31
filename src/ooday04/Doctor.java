package ooday04;

public class Doctor extends Person {
    String level;

    public Doctor(String name, int age, String address, String level) {
        super(name, age, address);
        this.level = level;
    }

    @Override
    void sayHi() {
        System.out.println("大家好，我叫" + name + ",今年" + age + "岁了，家住" + address+",我的职称是"+level);
    }
}
