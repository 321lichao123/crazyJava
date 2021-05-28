package chapter4;

import java.util.Calendar;

public class LenientTest {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.MONTH, 13);
        System.out.println(c1.getTime());
        // 关闭容性错误
        c1.setLenient(false);
        c1.set(Calendar.MONTH, 13); // java.lang.IllegalArgumentException
        System.out.println(c1.getTime());
    }
}
