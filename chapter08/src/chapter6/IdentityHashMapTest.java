package chapter6;

import java.util.IdentityHashMap;

public class IdentityHashMapTest {
    public static void main(String[] args) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        identityHashMap.put(new String("语文"), 89);
        identityHashMap.put(new String("语文"), 89);
        identityHashMap.put("java", 100);
        identityHashMap.put("java", 100);
        System.out.println(identityHashMap);
    }
}
