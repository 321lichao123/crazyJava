package chapter3;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    @Test
    public void test1() {
        Random random = new Random();
        // 随机去true和false
        System.out.println("random.nextBoolean()：" + random.nextBoolean());
        byte[] buffer = new byte[16];
        // 随机生成byte类型的数
        random.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        // 生成0.0~1.0之间的随机数
        System.out.println("random.nextDouble()：" + random.nextDouble());
        // 生成0.0~1.0的伪随机float数
        System.out.println("random.nextFloat()：" + random.nextFloat());
        // 生成平均值0.0 标准差是1.0的伪高斯数
        System.out.println("random.nextGaussian()：" + random.nextGaussian());
        // 生成一个处于int整数取值范围的为高斯数
        System.out.println("random.nextInt()：" + random.nextInt());
        // 生成0~26之间的伪随机整数
        System.out.println("random.nextInt(26)：" + random.nextInt(26));
        // 生成一个处于long整数取值返回的随机数
        System.out.println("random.nextLong()：" + random.nextLong());
    }
}
