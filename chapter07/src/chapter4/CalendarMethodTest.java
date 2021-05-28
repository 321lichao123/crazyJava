package chapter4;

import java.util.Calendar;

public class CalendarMethodTest {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(2003, 7, 23, 0, 0, 0);
        c1.add(Calendar.MONTH, 6);
        System.out.println(c1.getTime()); // 2004-2-23
        Calendar c2 = Calendar.getInstance();
        c2.set(2003, 7, 31, 0,0,0);
        c2.add(Calendar.MONTH, 6);
        System.out.println(c2.getTime()); // 2004-02-29
    }
}
