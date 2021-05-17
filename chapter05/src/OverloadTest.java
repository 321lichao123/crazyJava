public class OverloadTest {
    public void test() {
        System.out.println("无参数");
    }
    public void test(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        OverloadTest test = new OverloadTest();
        test.test();
        test.test("有参数的方法");
    }
}
