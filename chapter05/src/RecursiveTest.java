public class RecursiveTest {
    public static int fn(int n) {
        if (n == 0) {
            return 1;
        }else if (n == 1) {
            return 4;
        } else {
            return 2 * fn(n - 1) + fn(n - 2);
        }
    }

    public static void main(String[] args) {
        int sum = fn(10);
        System.out.println(sum);
    }
}
