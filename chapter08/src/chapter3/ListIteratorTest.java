package chapter3;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        String[] books = {
            "abc",
            "def"
        };
        ArrayList list = new ArrayList();
        for (String book : books) {
            list.add(book);
        }
        ListIterator listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.println("listIterator.next：" + listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println("listIterator.previous：" + listIterator.previous());
        }
    }
}
