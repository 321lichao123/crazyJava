package chapter1;

import java.util.Scanner;

public class ScannerKeyBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println("键盘输入的内容：" + sc.next());
        }
    }
}
