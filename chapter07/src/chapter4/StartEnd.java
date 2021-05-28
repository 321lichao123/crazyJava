package chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
    public static void main(String[] args) {
        String str = "java is very easy";
        System.out.println("原字符串：" + str);
        Matcher m = Pattern.compile("\\w+").matcher(str);
        while (m.find()) {
            System.out.println(m.group() + "子串开始的位置：" +
                    m.start() + ", 结束的位置：" + m.end());
        }
    }
}
