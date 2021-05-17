public class VariableOverrideTest {
    private String name = "李刚";
    private  static double price = 78.0;

    public void info() {
        String name = "孙悟空";
        System.out.println(name); // 孙悟空
        System.out.println(this.name); // 李刚
    }

    public static void main(String[] args) {
        int price = 65;
        System.out.println(price);  // 65
        System.out.println(VariableOverrideTest.price); // 78.0
        new VariableOverrideTest().info();
    }
}
