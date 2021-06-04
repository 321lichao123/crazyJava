package chapter5;

import java.util.HashMap;

public class MapTest2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("疯狂Java讲义", 109);
        map.put("疯狂IOS讲义",99);
        map.put("疯狂Aja讲义", 89);
        map.replace("疯狂XML讲义", 66);
        System.out.println(map);
        map.merge("疯狂IOS讲义", 20, (oldValue, params) -> (Integer) oldValue + (Integer) params);
        System.out.println(map);
        map.computeIfAbsent("Java", (key) -> ((String) key).length());
        System.out.println(map);
        map.computeIfPresent("Java", (key, value) -> (Integer) value * (Integer) value);
        System.out.println(map);
    }
}
