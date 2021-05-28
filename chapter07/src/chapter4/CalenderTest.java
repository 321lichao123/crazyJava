package chapter4;

import java.util.Calendar;

public class CalenderTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 取出年
        System.out.println(calendar.get(Calendar.YEAR));
        // 取出月
        System.out.println(calendar.get(Calendar.MONTH));
        // 取出天
        System.out.println(calendar.get(Calendar.DATE));
        // 分别设置年、月、日、小时、分、秒
        calendar.set(2022, 06, 29, 12, 24, 67);
        System.out.println(calendar.get(Calendar.YEAR));
        // 将年向前退一年
        calendar.add(Calendar.YEAR, -1);
        System.out.println(calendar.getTime());
        // 将月向前退8个月
        calendar.roll(Calendar.MONTH, -8);
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.getTime());
    }
}
