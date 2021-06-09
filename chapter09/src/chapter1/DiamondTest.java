package chapter1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DiamondTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("def");
        strings.forEach(value -> System.out.println((value.length())));

        HashMap<String, List<String>> stringListHashMap = new HashMap<>();
        ArrayList<String> schools = new ArrayList<>();
        schools.add("123");
        schools.add("456");
        stringListHashMap.put("孙悟空", schools);
        stringListHashMap.forEach((key, value) -> System.out.println(key + "->" + value));

    }
}
