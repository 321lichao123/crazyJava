package chapter3;

import org.junit.Test;

import java.math.BigDecimal;

public class DoubleTest {
    @Test
    public void test1() {
        System.out.println("0.05 + 0.01 = " + (0.05 + 0.01));
        System.out.println("1.0 - 0.43 = " + (1.0 - 0.43));
        System.out.println("4.105 * 100 = " + (4.105 * 100));
        System.out.println("123.3 / 100 = " + (123.3 / 100));
    }

    @Test
    public void BigDecimalTest() {
        BigDecimal b1 = new BigDecimal("0.05");
        BigDecimal b2 = BigDecimal.valueOf(0.01);
        BigDecimal b3 = new BigDecimal(0.05);
        System.out.println("使用String作为BigDecimal构造器参数");
        System.out.println("0.05 + 0.01 = " + b1.add(b2));
        System.out.println("0.05 - 0.01 = " + b1.subtract(b2));
        System.out.println("0.05 * 0.01 = " + b1.multiply(b2));
        System.out.println("0.05 / 0.01 = " + b1.divide(b2));
        System.out.println("使用Double作为BigDecimal构造器参数");
        System.out.println("0.05 + 0.01 = " + b3.add(b2));
        System.out.println("0.05 - 0.01 = " + b3.subtract(b2));
        System.out.println("0.05 * 0.01 = " + b3.multiply(b2));
        System.out.println("0.05 / 0.01 = " + b3.divide(b2));
    }

}
