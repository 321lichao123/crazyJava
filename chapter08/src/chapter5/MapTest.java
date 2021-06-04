package chapter5;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("疯狂Java讲义", 109);
        map.put("疯狂IOS讲义", 100);
        map.put("疯狂Ajax讲义", 89);
        map.put("轻量级Java EE企业应用实战", 99);
        System.out.println(map.put("疯狂IOS讲义", 99)); // 100
        System.out.println(map);
        System.out.println(map.containsKey("疯狂IOS讲义"));
        System.out.println(map.containsValue(99));
        for (Object key : map.keySet()) {
            System.out.println(key + "-->>" + map.get(key));
        }
        map.remove("疯狂IOS讲义");
        System.out.println(map);
    }
}
