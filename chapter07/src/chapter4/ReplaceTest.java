package chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceTest {
    public static void main(String[] args) {
        String[] str = {
                "java has regular expressions in 1.4",
                "regular expressions now expressing in java",
                "java represses oracular expressions"
        };
        Pattern p = Pattern.compile("re\\w*");
        Matcher m = null;
        for (String s : str) {
            if (m == null) {
                m = p.matcher(s);
            } else {
                m.reset(s);
            }
            System.out.println(m.replaceAll("哈哈:)"));
        }
    }
}
