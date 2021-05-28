package chapter3;

class Address {
    String detail;

    public Address(String detail) {
        this.detail = detail;
    }
}

// 实现cloneable接口
class User implements Cloneable {
    int age;
    Address address;
    public User(int age) {
        this.age = age;
        this.address = new Address("南京雨花台区");
    }
    // 通过super.clone()来实现clone
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(29);
        User u2 = u1.clone();
        System.out.println(u1 == u2);   // false
        System.out.println(u1.address == u2.address);   // true
    }
}
