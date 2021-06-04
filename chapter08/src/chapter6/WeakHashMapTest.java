package chapter6;

import java.util.WeakHashMap;

public class WeakHashMapTest {
    public static void main(String[] args) {
        WeakHashMap weakHashMap = new WeakHashMap();
        weakHashMap.put(new String("语文"), new String("及格"));
        weakHashMap.put(new String("数学"), new String("良好"));
        weakHashMap.put(new String("英语"), new String("良好"));
        System.out.println(weakHashMap);
        weakHashMap.put("java", "abc");
        System.out.println(weakHashMap);
        // 通知系统进行垃圾回收
        System.gc();
        System.runFinalization();
        System.out.println(weakHashMap);
    }
}
