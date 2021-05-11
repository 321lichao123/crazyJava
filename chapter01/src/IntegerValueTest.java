import org.junit.Test;

public class IntegerValueTest {
    @Test
    public void test1() {
        byte a = 56;

        // 错误:过大的整数: 999999999999
        // long b = 999999999999;
        // 正确的赋值
        long b = 999999999999L;

        System.out.println(b);
    }

    @Test
    public void test2() {
        // 八进制: 以0开头
        String octalValue = "013";
        // 二进制：以0B或者0b开头
        String binaryValue = "11010100";
        String binaryValue1 = "0b11010100";
        // 十六进制：以0x或者0X开头
        String hexValue = "13af";
        // 其他进制转为十进制：Integer.parseInt(String value, radix num);
        System.out.println("八进制转十进制：" + Integer.parseInt(octalValue, 8));
        System.out.println("二进制转十进制：" + Integer.parseInt(binaryValue, 2));
        System.out.println("十六进制转十进制：" + Integer.parseInt(hexValue, 16));
    }

    @Test
    public void test3() {
        // 直接指定单个字符作为字符值
        char aChar = 'a';
        // 使用转义字符作为字符值
        char enterChar = '\t';
        // 使用Unicode编码值来作为指定字符值
        char ch = '\u9999';
        System.out.println(ch);
        // 定义一个'疯'字符值
        char zhong = '疯';
        int zhongValue = zhong;
        System.out.println(zhongValue);
        // 直接在0~65535范围内的int整数赋值给一个char值
        char c = 123;
        System.out.println(c);
    }

    @Test
    public void FloatTest() {
        // 无穷大
        double dPositive = Double.POSITIVE_INFINITY;
        float fPositive = Float.POSITIVE_INFINITY;
        // 无穷小
        float negative = Float.NEGATIVE_INFINITY;
        System.out.println("无穷大：" + dPositive);  // Infinity
        System.out.println("无穷小：" + negative);  // -Infinity
        // float和double的无穷大相同的，无穷小同样的
        System.out.println(dPositive == fPositive);
        //
        float ft = 5.234563478545f;
        System.out.println(ft); // 5.2345634
        // 0.0/0.0将出现非数
        double a = 0.0;
        System.out.println(a / a);  // NaN
        // 两个非数之间不相等的
        System.out.println(a / a == Double.NaN);  // false
        // 所有的正无穷大都是相等的
        System.out.println(6.0 / a == dPositive); // true
        // 负数除以0.0等到无穷大
        System.out.println(-8 / a == negative); // true
        // 除数不能是0，否则报错: java.lang.ArithmeticException: / by zero
        // System.out.println(6 / 0);
    }

    @Test
    public void UnderscoreTest() {
        // 可以在数值中使用下划线，不管是整数型还是浮点型
        int binValue = 0b1000_0000_0000_0000_0000_0000_0000_0011;
        double pi = 3.14_15_92_65_36;
        double height = 8_8_4_8.34;
        System.out.println(binValue);
        System.out.println(pi);
        System.out.println(height);
    }

    @Test
    public void BooleanTest() {
        boolean b1 = false;
        String strB = b1 + "";
        System.out.println(strB);
        System.out.println(strB instanceof String);
    }

    @Test
    public void AutoConversionTest() {
        int a = 6;
        float f = a;
        System.out.println(f);

        char c = 'a';
        double d = c;
        System.out.println(d);
    }

    @Test
    public void PrimitiveAndString() {
        // 自动转为字符串
        String str = 5 + "";
        // 7hello
        System.out.println(3 + 4 + "hello");
        //hello34
        System.out.println("hello" + 3 + 4);
    }

    @Test
    public void NarrowConversion() {
        int i = 233;
        // 十进制转为二进制
        String s = Integer.toBinaryString(i);
        System.out.println("强转之前的整数二进制：" + s); // 0000_0000_0000_0000_0000_0000_1110_1001
        // 强制转为byte类型
        byte b = (byte) i;
        String s1 = Integer.toBinaryString(b);
        System.out.println("强转之后的整数二进制：" + s1); // 1111_1111_1111_1111_1111_1111_1110_1001
        System.out.println(b); // -23

        System.out.println("***********************");

        double d = 2.6;
        int dti = (int) d;
        System.out.println(dti); // 2
    }

    @Test
    public void RandomString() {
        String result = "";
        for (int i = 0; i < 6; i++) {
            // 生成97~122的随机整数,char的范围是a~z
            int intVal = (int) (Math.random() * 26 + 97);
            char charVal = (char) intVal;
            result += charVal;
        }
        System.out.println(result);
    }

    @Test
    public void AutoPromote() {
        short sValue = 5;
        // 报错：java: 不兼容的类型: 从int转换到short可能会有损失
        // sValue = sValue - 2;
        // 因为short、byte、char的运算自动转为int类型
        int iValue = sValue - 2;
        System.out.println(iValue);

        byte b = 40;
        char c = 'a'; // 97
        int i = 23;
        double d = 3.14;
        double v = b + c + i + d;
        // 因为整个运算式中最高的是double，因此右边的变量类型是double
        System.out.println(v); // 163.14

        int i1 = 23;
        int i2 = 23 / 3;
        System.out.println(i2); // 7
    }

    @Test
    public void ConstantToolTest() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "he" + "llo";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        s2 = "java";
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void DiviValueTest() {
        double a = 5.2;
        double b = 3.1;
        double c = -3.4;
        double div = a / b;
        System.out.println(div);
        System.out.println(a / 0);      // Infinity
        System.out.println(c / 0.0);    // -Infinity
    }

    @Test
    public void ModTest() {
        double a = 5.2;
        double b = 3.1;
        double d = a % b;
        System.out.println(d);  // 2.1
        System.out.println("5对0.0的取余：" + 5 % 0.0);  // NaN
        System.out.println("-5.0对0的取余：" + -5.0 % 0); // NaN
        System.out.println("0对5.0的取余：" + 0 % 5.0); // 0.0
        System.out.println("0对0.0的取余：" + 0 % 0.0); // NaN
    }

    @Test
    public void SelfAdditionTest() {
        int a = 5;
        int b = a++ + 6;
        System.out.println("a = " + a + ", b = " + b); // a=6,b=11

        int c = 5;
        int d = ++c + 6;
        System.out.println("c = " + c + ", d = " + d); // c = 6, d = 12
        // 自加和自减只能操作变量，而不能直接操作直接量、常量、表达式
        // System.out.println(5++); // 意外的类型

        System.out.println(4 >> 33);
    }

    @Test
    public void ComparableOperatorTest() {
        ComparableOperatorClassTest c1 = new ComparableOperatorClassTest();
        ComparableOperatorClassTest c2 = new ComparableOperatorClassTest();
        System.out.println(c1 == c2);
        ComparableOperatorClassTest c3 = c1;
        System.out.println(c1 == c3);
    }
}

class ComparableOperatorClassTest {

}
