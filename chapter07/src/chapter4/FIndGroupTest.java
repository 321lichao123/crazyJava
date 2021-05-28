package chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FIndGroupTest {
    public static void main(String[] args) {
        String str = "我想求购一本《疯狂Java》，请尽快练习我13500006663" +
                "交朋友，电话号码：13611125565" +
                "出售二手电脑，联系方式15899903312";
        Matcher compile = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
        while (compile.find()) {
            System.out.println(compile.group());
        }
    }
}
