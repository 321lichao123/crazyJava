public class PrimitiveTransferTest {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap里面，a的值是" + a + ", b的值是" + b);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        swap(a, b);
        System.out.println("swap外面，a的值是" + a + ", b的值是" + b);
    }
}
