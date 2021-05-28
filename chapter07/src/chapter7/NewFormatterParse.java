package chapter7;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewFormatterParse {
    public static void main(String[] args) {
        String str = "2014==04==12 01时06分09秒";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy==MM==dd HH时mm分ss秒");
        LocalDateTime parse = LocalDateTime.parse(str, dateTimeFormatter);
        System.out.println(parse);

        System.out.println("****************");

        String str2 = "2014$$$四月$$$13 20小时";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyy$$$MMM$$$dd HH小时");
        LocalDateTime parse1 = LocalDateTime.parse(str2, dateTimeFormatter1);
        System.out.println(parse1);
    }
}
