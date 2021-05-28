package chapter6;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class NumberFormaTest {
    public static void main(String[] args) {
        double db = 1234000.567;
        Locale[] locales = {Locale.CHINA, Locale.JAPAN, Locale.GERMAN, Locale.US};
        NumberFormat[] formats = new NumberFormat[12];
        for (int i = 0; i < locales.length; i++) {
            formats[i * 3] = NumberFormat.getNumberInstance(locales[i]);
            formats[i * 3 + 1] = NumberFormat.getPercentInstance(locales[i]);
            formats[i * 3 + 2] = NumberFormat.getCurrencyInstance(locales[i]);
        }
        for (int i = 0; i < locales.length; i++) {
            String tip = i == 0 ? "---中国格式---" :
                i == 1 ? "---日本格式---" :
                i == 2 ? "---德国格式---" : "---美国格式---";
            System.out.println(tip);
            System.out.println("通用数据格式：" + formats[i * 3].format(db));
            System.out.println("百分比数据格式：" + formats[i * 3 + 1].format(db));
            System.out.println("货币数值格式：" + formats[i * 3 + 2].format(db));
        }
    }
}
