import org.junit.Test;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.System.*;

public class Chapter05 {
    @Test
    public void PersonTest() {
        class Person {
            public String name;
            public int age;
            public void say(String content) {
                System.out.println(content);
            }
        }
        Person p = new Person();
        p.name = "李刚";
        p.say("Java语言很简单，学习很容易的");
        System.out.println(p.name);

    }

    @Test
    public void StaticImportTest() {
        out.println(PI);
        out.println(sqrt(256));
    }

}
