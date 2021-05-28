package chapter3;

import org.junit.Test;

public class StringMethodsTest {
    @Test
    public void charAtTest() {
        String str = new String("fkit.org");
        System.out.println("str.chartAt(5):" + str.charAt(5));
    }

    @Test
    public void CompareToTest() {
        String str1 = new String("abcdefghijklmn");
        String str2 = new String("abc");
        String str3 = new String("abcdefghijaklmn");
        System.out.println("str1.compareTo(str2):" + str1.compareTo(str2));
        System.out.println("str1.compareTo(str3):" + str1.compareTo(str3));
    }

    @Test
    public void endsWithTest() {
        String str1 = "fkit.org";
        String str2 = ".org";
        System.out.println("str1.endsWith(str2)：" + str1.endsWith(str2));
    }

    @Test
    public void getCharsTest() {
        char[] s1 = {'I', ' ', 'l', 'o', 'v', 'e',  ' ','j', 'a', 'v', 'a'};
        String s2 = new String(s1);
        System.out.println(s2);
        s2.getChars(0, 3, s1, 7);
        System.out.println(s1);
    }

    @Test
    public void indexOfTest() {
        String str1 = "www.fkit.org";
        String str2 = "it";
        System.out.println("str1.indexOf('r')：" + str1.indexOf('r'));
        System.out.println("str1.indexOf('r', 2)：" + str1.indexOf('r', 2));
        System.out.println("str1.indexOf(str2)：" + str1.indexOf(str2));
    }
}
