package chapter7;

import java.lang.reflect.Array;
import java.util.*;

public class SynchroinzedTest {
    public static void main(String[] args) {
        Collection c = Collections.synchronizedCollection(new ArrayList());
        List list = Collections.synchronizedList(new ArrayList());
        Map map = Collections.synchronizedMap(new HashMap());
        Set set = Collections.synchronizedSet(new HashSet());
    }
}
