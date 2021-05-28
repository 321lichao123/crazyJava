package chapter6;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) {
        Date date = new Date();
        Locale[] locales = {Locale.CHINA, Locale.US};
        DateFormat[] formats = new DateFormat[16];
        for (int i = 0; i < locales.length; i++) {
            formats[i * 8] = DateFormat.getDateInstance(DateFormat.SHORT, locales[i]);
            formats[i * 8 + 1] = DateFormat.getDateInstance(DateFormat.MEDIUM, locales[i]);
            formats[i * 8 + 2] = DateFormat.getDateInstance(DateFormat.LONG, locales[i]);
            formats[i * 8 + 3] = DateFormat.getDateInstance(DateFormat.FULL, locales[i]);
            formats[i * 8 + 4] = DateFormat.getTimeInstance(DateFormat.SHORT, locales[i]);
            formats[i * 8 + 5] = DateFormat.getTimeInstance(DateFormat.MEDIUM, locales[i]);
            formats[i * 8 + 6] = DateFormat.getTimeInstance(DateFormat.LONG, locales[i]);
            formats[i * 8 + 7] = DateFormat.getTimeInstance(DateFormat.FULL, locales[i]);
        }
        for (int i = 0; i < locales.length; i++) {
            String tip = i == 0 ? "---中国日期格式---" : "---美国日期格式---";
            System.out.println(tip);
            System.out.println("SHORT的日期格式：" + formats[i * 8].format(date));
            System.out.println("MEDIUM的日期格式：" + formats[i * 8 + 1].format(date));
            System.out.println("LONG的日期格式：" + formats[i * 8 + 2].format(date));
            System.out.println("FULL的日期格式：" + formats[i * 8 + 3].format(date));
            System.out.println("SHORT的日期格式：" + formats[i * 8 + 4].format(date));
            System.out.println("MEDIUM的日期格式：" + formats[i * 8 + 5].format(date));
            System.out.println("LONG的日期格式：" + formats[i * 8 + 6].format(date));
            System.out.println("FULL的日期格式：" + formats[i * 8 + 7].format(date));
        }
    }
}
