package chapter2;

public class RuntimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("处理器的数量：" + runtime.availableProcessors());
        System.out.println("空闲内存数：" + runtime.freeMemory());
        System.out.println("总内存条数：" + runtime.totalMemory());
        System.out.println("最大的内存的条数：" + runtime.maxMemory());
    }
}
