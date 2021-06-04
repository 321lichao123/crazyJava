package chapter3;

import java.util.ArrayList;

public class ListTest3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new String("疯狂Java EE企业应用实战"));
        list.add(new String("疯狂Java讲义"));
        list.add(new String("疯狂Android讲义"));
        list.add(new String("疯狂IOS讲义"));
        list.sort((o1, o2) -> ((String) o1).length() - ((String) o2).length());
        System.out.println(list);
        list.replaceAll(ele -> ((String) ele).length());
        System.out.println(list);
    }
}
