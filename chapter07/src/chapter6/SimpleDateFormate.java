package chapter6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormate {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("Gyyyy年中第D天");
        System.out.println(format.format(date));
        String str = "21###五月##28";
        SimpleDateFormat format1 = new SimpleDateFormat("y###MMM##d");
        System.out.println(format1.parse(str));
    }
}
