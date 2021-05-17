public class OverloadTest2 {
    public void test(String book) {
        System.out.println("一个字符串参数的test方法");
    }

    public void test(String ...books) {
        System.out.println("形参可变的参数的test方法");
    }

    public static void main(String[] args) {
        OverloadTest2 test2 = new OverloadTest2();
        test2.test();                   // 形参可变的参数的test方法
        test2.test("aa", "bb"); // 形参可变的参数的test方法
        test2.test("aa");         // 一个字符串参数的test方法
        test2.test(new String[]{"aa"}); // 形参可变的参数的test方法
    }
}
