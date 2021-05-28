package chapter2;

import java.io.IOException;

public class ExectTest {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        rt.exec("notepad.exe");
    }
}
