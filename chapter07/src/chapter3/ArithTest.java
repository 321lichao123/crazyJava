package chapter3;

import java.math.BigDecimal;

public class ArithTest {
    // 默认除法运算精度
    private static final int DEF_DIV_SCALE = 10;
    // 构造器私有，让这个类不能实例化
    private ArithTest(){};
    // 提供精确的加法运算
    public static double add(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.add(b2).doubleValue();
    }

    public static float sub(float v1, float v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.subtract(b2).floatValue();
    }

    public static double mul(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.multiply(b2).doubleValue();
    }

    public static double div(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_UP).doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("0.05 + 0.01 = " + ArithTest.add(0.05, 0.01));
        System.out.println("0.05 - 0.01 = " + ArithTest.sub(0.05f, 0.01f));
        System.out.println("0.05 * 0.01 = " + ArithTest.mul(0.05, 0.01));
        System.out.println("0.05 / 0.01 = " + ArithTest.div(0.05, 0.03));
    }
}
