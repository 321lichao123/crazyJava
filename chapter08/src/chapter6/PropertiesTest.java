package chapter6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("username", "lisi");
        properties.setProperty("password", "admin@123");
        properties.store(new FileOutputStream("a.ini"), "comment line");
        Properties properties1 = new Properties();
        properties1.setProperty("gender", "1");
        properties1.load(new FileInputStream("a.ini"));
        System.out.println(properties1);
    }
}
