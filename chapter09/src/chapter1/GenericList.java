package chapter1;

import java.util.ArrayList;

public class GenericList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
//        list.add(5); //对于add(int), 找不到合适的方法
        list.forEach(value -> System.out.println(((String) value).length()));
    }
}
