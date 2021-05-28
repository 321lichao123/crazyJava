package chapter4;

import sun.util.resources.LocaleData;

import java.time.*;

public class NewDatePackageTest {
    public static void main(String[] args) {
        // ------------Clock的用法--------------
        Clock clock = Clock.systemUTC();
        // 当前时刻
        System.out.println("当前时刻：" + clock.instant());
        // 获取clock对应的毫秒数，与System.currentTimeMills相同
        System.out.println("clock.millis毫秒数：" + clock.millis());
        System.out.println("System.currentTimeMillis毫秒数：" + System.currentTimeMillis());

        // ------------Duration的用法------------------
        Duration duration = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于" + duration.toMinutes() + "分");
        System.out.println("6000秒相当于" + duration.toHours() + "小时");
        System.out.println("6000秒相当于" + duration.toDays() + "天");
        // 再新的clock基础上添加6000秒返回新的clock
        Clock clock1 = Clock.offset(clock, duration);
        System.out.println("当前时间添加6000秒为：" + clock1.instant());

        //-----------关于instance的用法----------
        Instant instant = Instant.now();
        System.out.println(instant);
        // instant添加6000秒返回新的instant
        Instant instant1 = instant.plusSeconds(6000);
        System.out.println(instant1);
        // 根据字符串解析instant对象
        Instant instant2 = Instant.parse("2021-05-27T08:19:47.159Z");
        System.out.println(instant2);
        // 在上面的基础上添加5小时4分支
        Instant instant3 = instant2.plus(Duration.ofHours(4).plusMinutes(4));
        System.out.println(instant3);
        // 获取instant3的5天之前的值
        Instant instant4 = instant3.minus(Duration.ofDays(5));
        System.out.println(instant4);

        // -----------LocalData的用法---------------
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        // 获取当前日期的第146天
        localDate = LocalDate.ofYearDay(2021, 146);
        System.out.println(localDate);

        // --------LocalTime的用法---------
        LocalTime localTime = LocalTime.now();
        localTime = LocalTime.of(22, 23);
        System.out.println(localTime);
        localTime = LocalTime.ofSecondOfDay(5503);
        System.out.println(localTime);

        // ----------LocalDateTime---------------
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusHours(25).plusMinutes(3);
        System.out.println(localDateTime1);

        // ---------------Year、YearMonth、MonthDay---------------------
        Year year = Year.now();
        System.out.println("当前的年份：" + year);
        year = year.plusYears(5);
        System.out.println("当前的年份：" + year);
        // 根据指定月份获取yearMonth
        YearMonth yearMonth1 = year.atMonth(10);
        System.out.println(yearMonth1);
        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);

    }
}
