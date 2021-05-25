package com.chapter9;

public class GenderTest {
    public static void main(String[] args) {
        Gender female = Gender.valueOf(Gender.class, "FEMALE");
//        female.setName("女");
//        female.setName("男");
        System.out.println(female + "代表：" + female.getName());
        female.info();
    }
}
