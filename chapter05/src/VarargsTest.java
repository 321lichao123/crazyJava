public class VarargsTest {
    public static void test(int a, String ...books) {
        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        test(3, "疯狂Java", "hello world");
    }
}
