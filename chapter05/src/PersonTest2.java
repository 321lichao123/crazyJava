public class PersonTest2 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if (len > 6 ||len < 2) {
            System.out.println("输入的名字不合法");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0) {
            System.out.println("输入的年龄不合法");
        } else {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        PersonTest2 p = new PersonTest2();
        p.setAge(1000);
        System.out.println(p.getAge());
        p.setAge(18);
        p.setName("李刚");
        System.out.println(p.getName());
        System.out.println(p.getAge());

    }
}
