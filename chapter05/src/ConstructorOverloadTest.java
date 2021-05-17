public class ConstructorOverloadTest {
    private String name;
    private int age;
    private char sex;
    public ConstructorOverloadTest() {
    }

    public ConstructorOverloadTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ConstructorOverloadTest(String name, int age, char sex) {
        this(name, age);
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        ConstructorOverloadTest test1 = new ConstructorOverloadTest();
        ConstructorOverloadTest test2 = new ConstructorOverloadTest("张三", 20);
        System.out.println(test1.name + " " + test1.age);
        System.out.println(test2.name + " " + test2.age);
    }
}
