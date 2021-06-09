package chapter4;

class Foo {
    public <T> Foo(T t) {
        System.out.println(t);
    }
}

public class GenericConstructor {
    public static void main(String[] args) {
        new Foo("abc");
        new Foo(12.34);

        new <String> Foo("bfd");
//        new <String> Foo(12.56); // double无法转换为java.lang.String
    }
}
