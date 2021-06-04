package chapter6;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap lm = new LinkedHashMap();
        lm.put("数学", 100);
        lm.put("语文", 90);
        lm.put("外语", 87);
        lm.forEach((key, value) -> System.out.println(key + "-->>" + value));
    }
}
