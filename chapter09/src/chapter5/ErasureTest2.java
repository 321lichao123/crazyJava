package chapter5;

import java.util.ArrayList;

public class ErasureTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        ArrayList list2 = list;
        ArrayList<String> list3 = list2;
        System.out.println(list3.get(0));
    }
}
