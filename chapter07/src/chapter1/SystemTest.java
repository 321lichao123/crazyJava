package chapter1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) throws IOException {
        // 获取系统所有的环境变量
        Map<String, String> getenv = System.getenv();
        for (String name : getenv.keySet()) {
            System.out.println(name + "-->>" + getenv.get(name));
        }
        // 获取指定环境变量的值
        System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME"));

        System.out.println("********************************");

        // 获取所有的系统属性
        Properties properties = System.getProperties();
        // 将所有的系统属性保存到props.txt文件中
        properties.store(new FileOutputStream("prop.txt"), "System Properties");
        // 输出特定的系统属性
//        System.out.println(System.getProperties("os.name"));
    }
}
