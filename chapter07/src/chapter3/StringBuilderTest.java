package chapter3;

import org.junit.Test;

public class StringBuilderTest {
    @Test
    public void Test1() {
        StringBuilder st = new StringBuilder();
        System.out.println(st.length());
        System.out.println(st.capacity());
        st.append("java");
        System.out.println(st);
        st.insert(0, "hello ");
        System.out.println(st);
        st.replace(5, 6, ",");
        System.out.println(st);
        st.delete(5, 6);
        System.out.println(st);
        System.out.println(st.length());
        System.out.println(st.capacity());
        st.setLength(5);
        System.out.println(st);
    }

    @Test
    public void MathMethodTest() {
        // 将弧度转为角度
        System.out.println("Math.toDegrees(1.57)：" + Math.toDegrees(1.57));
        // 将角度转为弧度
        System.out.println("Math.toRadians(90)：" + Math.toRadians(90));
        // 计算反正铉，返回的角度范围在0.0到PI之间
        System.out.println("Math.acos(1.2)：" + Math.acos(0.2));
        // 计算反正切，返回的角度范围在-PI/2到PI/2之间
        System.out.println("Math.asin(0.8)： " + Math.asin(0.8));
        // 计算三角余铉
        System.out.println("Math.cos(1.57)：" + Math.cos(1.57));
        // 计算双曲余玄
        System.out.println("Math.cosh(1.2)：" + Math.cosh(1.2));
        System.out.println("**************取整运算***********");
        // 向下取整
        System.out.println("Math.floor(1.2)：" + Math.floor(1.2));
        System.out.println("Math.floor(-1.2)：" + Math.floor(-1.2));
        // 向上取整
        System.out.println("Math.ceil(1.2)：" + Math.ceil(1.2));
        System.out.println("Math.ceil(-1.2)：" + Math.ceil(-1.2));
        // 四舍五入取整
        System.out.println("Math.round(1.2)：" + Math.round(1.2));
        System.out.println("Math.round(1.6)：" + Math.round(1.6));
        // 计算平方根
        System.out.println("Math.sqrt(4)：" + Math.sqrt(4));
        // 计算立方根
        System.out.println("Math.cbrt(9)：" + Math.cbrt(9));
        // 返回欧拉数e的n次幂
        System.out.println("Math.exp(2)：" + Math.exp(2));
        // 返回sqrt(x2 + y2)，没有中间溢出或下溢
        System.out.println("Math.hypot(4, 4)：" + Math.hypot(4, 4));
        // 按照IEEE754标准的规定，对两个参数进行余数运算
        System.out.println("Math.IEEEremainder(5, 2)：" + Math.IEEEremainder(5, 2));
        // 计算乘方
        System.out.println("Math.pow(3, 2)：" + Math.pow(3, 2));
        // 计算自然对数
        System.out.println("Math.log(12)：" + Math.log(12));
        // 计算底数为10的对数
        System.out.println("Math.log10(9)" + Math.log10(9));
        System.out.println("********符号相关的运算********");
        // 绝对值
        System.out.println("Math.abs(-12)：" + Math.abs(-12));
        System.out.println("Math.max(2.4, 5.6)：" + Math.max(2.4, 5.6));
    }
}
