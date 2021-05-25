package com.chapter1;

import org.junit.Test;

public class AutoBoxUnBoxingTest {
    @Test
    public void AutoBoxUnBoxing() {
        Integer iObj = 5;
        Object bObj = true;
        int i = iObj;
        if (bObj instanceof Boolean) {
            boolean b = (Boolean) bObj;
            System.out.println(b);
        }
    }

    @Test
    public void Primitive2String() {
        String intStr = "123";
        // 字符串转为int类型
        int int1 = Integer.parseInt(intStr);
        int int2 = new Integer(intStr);
        System.out.println(int2);

        String floatStr = "12.45";
        float float1 = Float.parseFloat(floatStr);
        float float2 = new Float(floatStr);
        System.out.println(float2);

        //将基本类型转为字符串
        float float3 = 12.34f;
        String fStr = String.valueOf(float3);
        long long1 = 12345;
        String longStr = String.valueOf(long1);
    }

    @Test
    public void WrapperClassCompare() {
        Integer integer = new Integer(6);
        System.out.println("6的包装类是否大于5.0：" + (integer > 5.0));  // true

        System.out.println("2的包装类是否相等：" + (new Integer(2) == new Integer(2))); // false

        Integer integer1 = 99;
        Integer integer2 = 99;
        System.out.println("99自动装箱是否相等：" + (integer1 == integer2)); // true

        Integer integer3 = 198;
        Integer integer4 = 198;
        System.out.println("198自动装箱是否相等：" + (integer3 == integer4)); // false
    }

    @Test
    public void UnsignedTest() {
        byte b = -3;
        System.out.println("byte类型的-3转为对应无符号整数：" + Byte.toUnsignedInt(b)); // 253

        int val = Integer.parseUnsignedInt("ab", 16);
        System.out.println("指定使用十六进制解析无符号整数：" + val); // 171

        System.out.println("将-12转为无符号的int，再转为字符串：" + Integer.toUnsignedString(-12, 16)); // fffffff4

        System.out.println("将两个整数转为无符号后相除：" + Integer.divideUnsigned(-2, 4));
        System.out.println("将两个整数转为无符号后相除：" + Integer.remainderUnsigned(-2, 4));

    }
}
