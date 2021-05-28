package chapter4;

import java.util.Arrays;

public class StringRexTest {
    public static void main(String[] args) {
        String[] str = {
                "java has regular expressions in 1.4",
                "regular expressions now expressing in java",
                "java represses oracular expressions"
        };
        for (String s : str) {
            System.out.println(s.replaceAll("re\\w*", "哈哈:)"));
            System.out.println(Arrays.toString(s.split(" ")));
        }
    }
}
