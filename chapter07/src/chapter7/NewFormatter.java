package chapter7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class NewFormatter {
    public static void main(String[] args) {
        DateTimeFormatter[] formatters = {
                // 直接使用常量创建DateTimeFormatter格式器
                DateTimeFormatter.ISO_LOCAL_DATE,
                DateTimeFormatter.ISO_LOCAL_TIME,
                DateTimeFormatter.ISO_LOCAL_DATE_TIME,
                // 使用本地化的不同风格来创建DateTimeFormatter格式器
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
                DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
                // 根据模式字符串来创建DateTImeFormatter格式器
                DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
        };
        LocalDateTime now = LocalDateTime.now();
        for (int i = 0; i < formatters.length; i++) {
            System.out.println(now.format(formatters[i]));
            System.out.println(formatters[i].format(now));
            System.out.println("**************************");
        }
    }
}
