package chapter3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SeedTest {
    public static void main(String[] args) {
        Random r1 = new Random(50);
        System.out.println("第一个种子为50的random对象");
        System.out.println("r1.nextBoolean()：\t" + r1.nextBoolean());
        System.out.println("r1.nextInt()：\t\t" + r1.nextInt());
        System.out.println("r1.nextDouble()：\t" + r1.nextDouble());
        System.out.println("r1.nextGaussian()：\t" + r1.nextGaussian());
        System.out.println("******************");
        Random r2 = new Random(50);
        System.out.println("第二个种子为50的random对象");
        System.out.println("r2.nextBoolean()：\t" + r2.nextBoolean());
        System.out.println("r2.nextInt()：\t\t" + r2.nextInt());
        System.out.println("r2.nextDouble()：\t" + r2.nextDouble());
        System.out.println("r2.nextGaussian()：\t" + r2.nextGaussian());
        System.out.println("******************");
        Random r3 = new Random(100);
        System.out.println("第三个种子为50的random对象");
        System.out.println("r3.nextBoolean()：\t" + r3.nextBoolean());
        System.out.println("r3.nextInt()：\t\t" + r3.nextInt());
        System.out.println("r3.nextDouble()：\t" + r3.nextDouble());
        System.out.println("r3.nextGaussian()：\t" + r3.nextGaussian());
        System.out.println("******************");
        ThreadLocalRandom c1 = ThreadLocalRandom.current();
        System.out.println("第四个种子为50的random对象");
        System.out.println("c1.nextBoolean()：\t" + c1.nextBoolean());
        System.out.println("c1.nextInt()：\t\t" + c1.nextInt());
        System.out.println("c1.nextDouble()：\t" + c1.nextDouble());
        System.out.println("c1.nextGaussian()：\t" + c1.nextGaussian());
        System.out.println("******************");
        ThreadLocalRandom c2 = ThreadLocalRandom.current();
        System.out.println("第五个种子为50的random对象");
        System.out.println("c2.nextBoolean()：\t" + c2.nextBoolean());
        System.out.println("c2.nextInt()：\t\t" + c2.nextInt());
        System.out.println("c2.nextDouble()：\t" + c2.nextDouble());
        System.out.println("c2.nextGaussian()：\t" + c2.nextGaussian());

    }
}
