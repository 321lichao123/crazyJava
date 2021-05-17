public class PersonTest {
    public static void main(String[] args) {
        System.out.println("Person类的age的值" + Person.age);

        Person p1 = new Person();
        System.out.println("p1变量的name值：" + p1.name + ", p1变量的age值：" + p1.age);

        p1.name = "孙悟空";
        p1.age = 10000;
        System.out.println("p1变量的name值：" + p1.name + ", p1变量的age值：" + p1.age);

        System.out.println("Person类的age的值" + Person.age);

        Person p2 = new Person();
        System.out.println("p2变量的name值：" + p2.name + ", p1变量的age值：" + p2.age);
    }
}

class Person {
    // 实例变量
    public String name;
    // 类变量
    public static int age;
}
