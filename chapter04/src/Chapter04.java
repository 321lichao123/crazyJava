import org.junit.Test;

import javax.xml.transform.Source;
import java.util.Arrays;

public class Chapter04 {
    @Test
    public void IfCorrectTest() {
        int age = 45;
        if(age > 60) {
            System.out.println("老年人");
        } else if(age > 40) {
            System.out.println("中年人");
        } else if(age > 20) {
            System.out.println("青年人");
        }
    }

    @Test
    public void SwitchTest() {
        char score = 'C';
        switch (score) {  // 控制表达式只能是byte、char、short、int、枚举类型、Java.lang.String
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良");
                break;
            case 'C':
                System.out.println("中");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'E':
                System.out.println("不及格");
                break;
        }
    }

    @Test
    public void WhileTest() {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }
        System.out.println("循环结束");
    }

    @Test
    public void WhileTest1() {
        int count = 0;
        while (count < 9);  // 不会执行下面的语句，一直再while循环中
        {
            System.out.println("循环开始：" + count);
            count++;
        }
        System.out.println("循环结束：" + count);
    }

    @Test
    public void DoWhileTest() {
        int count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count < 10);
        System.out.println("循环结束");
    }

    @Test
    public void ForTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void ForTest2() {
        for (int b = 0, s = 0, p = 0; b < 10 && s < 4 && p < 10; p++) {
            System.out.println(b++);
            System.out.println(++s + p);
        }
    }

    @Test
    public void DeadForTest() {
        int count = 0;
        for (;;) {
            System.out.println("============");
            count++;
            if (count == 10) break;
        }
    }

    @Test
    public void NestedLoopTest() {
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 3; i1++) {
                System.out.println("i = " + i + ", i1 =" + i1);
            }
        }
    }

    @Test
    public void BreakTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i的值：" + i);
            if (i == 2) break;
        }
    }

    @Test
    public void BreakTest2() {
        outer:for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.println("i的值：" + i + ", j的值：" + j);
                if (i == j) break outer;
            }
        }
    }

    @Test
    public void ContinueTest() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i的值：" + i);
            if (i == 2) continue;
            System.out.println("continue的语句");
        }
    }

    @Test
    public void ContinueTest2() {
        outer:for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i的值：" + i + ", j的值：" + j);
                if (i == j) continue outer;
            }
        }
    }

    @Test
    public void ReturnTest() {
        outer:for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i的值：" + i + ", j的值：" + j);
                if (i == j) return;
            }
        }
    }

    @Test
    public void ArrayTest() {
        // 定义一个int数组类型的变量
        int[] intArr;
        // 静态初始化数组
        intArr = new int[]{10, 11, 12, 13};
        // 定义和初始化一起
        Object objArr = new String[]{"java", "李刚"};
        // 简写
        int[] intArr1 = {1, 2, 3, 4};
    }

    @Test
    public void ForEachTest() {
        String[] strArr = {"李刚", "java"};
        for (String s : strArr) {
            System.out.println(s);
        }
    }

    @Test
    public void ArrayInRam() {
        int[] a = {1, 2, 3};
        int[] b = new int[4];
        System.out.println("b数组的长度：" + b.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a的元素：" + a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("b的元素：" + b[i]);
        }
        b = a;
        System.out.println("b数组的长度：" + b.length);
    }

    @Test
    public void PrimitiveArrayTest() {
        int[] intArr = new int[5];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 10;
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }

    @Test
    public void ReferenceArrayTest() {
        PersonReferenceArray[] pArr = new PersonReferenceArray[2];
        PersonReferenceArray p1 = new PersonReferenceArray();
        p1.name = "张三";
        p1.age = 18;
        PersonReferenceArray p2 = new PersonReferenceArray();
        p2.name = "李四";
        p2.age = 20;
        pArr[0] = p1;
        pArr[1] = p2;
        p1.info();
        pArr[0].info();
    }

    @Test
    public void TwoDimensionTest() {
        int[][] arr = new int[4][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        arr[0] = new int[2];
        arr[0][1] = 6;
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(arr[0][i]);
        }
    }

    @Test
    public void ArraysTest() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int[] arr3 = new int[]{1, 2, 3, 5, 4};

        System.out.println("数组arr1与arr2是否相等：" + Arrays.equals(arr1, arr2));  // true
        System.out.println("数组arr1与arr2是否相等：" + Arrays.equals(arr1, arr3));  // false

        int[] arr4 = Arrays.copyOf(arr1, 6);
        System.out.println("数组arr1与arr4是否相等：" + Arrays.equals(arr1, arr4));  // false
        System.out.println("数组arr4的元素" + Arrays.toString(arr4)); // [1, 2, 3, 4, 5, 0]

        Arrays.fill(arr4, 3, 5, 1);
        System.out.println("数组arr4的元素" + Arrays.toString(arr4)); // [1, 2, 3, 1, 1, 0]

        Arrays.sort(arr4);
        System.out.println("数组arr4的元素" + Arrays.toString(arr4)); // [0, 1, 1, 1, 2, 3]

    }

}

class PersonReferenceArray {
    public String name;
    public int age;
    public void info() {
        System.out.println("我的名字是：" + name + ", 年龄是：" + age);
    }
}
