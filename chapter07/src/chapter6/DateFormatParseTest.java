package chapter6;

import java.text.DateFormat;
import java.text.ParseException;

public class DateFormatParseTest {
    public static void main(String[] args) throws ParseException {
        String str1 = "2014-12-12";
        String str2 = "2014年12月10日";
        System.out.println(DateFormat.getDateInstance().parse(str1));
        System.out.println(DateFormat.getDateInstance(DateFormat.LONG).parse(str2));
        System.out.println(DateFormat.getDateInstance().parse(str2)); // java.text.ParseException
    }
}
