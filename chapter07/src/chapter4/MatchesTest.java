package chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesTest {
    public static void main(String[] args) {
        String[] mails = {
          "123@163.com",
          "456@gamil.com",
          "789",
          "wawa@abc.com"
        };
        String mailRex = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
        Pattern pattern = Pattern.compile(mailRex);
        Matcher matcher = null;
        for (String mail : mails) {
            if (matcher == null) {
                matcher = pattern.matcher(mail);
            } else {
                matcher.reset();
            }
            String result = mail + (matcher.matches() ? "是" : "不是") + "一个有效的邮箱";
            System.out.println(result);
        }

    }
}
