package chapter1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileTest {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("./chapter07/src/chapter1/ScannerFileTest.java"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

    }
}
