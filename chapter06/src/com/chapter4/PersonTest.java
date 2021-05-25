package com.chapter4;

class Name {
    private String firstName;
    private String lastName;

    public Name() {
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

public class PersonTest {
    private final Name name;

    public PersonTest(Name name) {
        this.name = name;
    }

    public Name getName() {
        // 这种写法不能控制personTest不可变
        // return name;
        // 使用下面的写法
        return new Name(name.getFirstName(), name.getLastName());
    }

    public static void main(String[] args) {
        Name name = new Name("孙", "悟空");
        PersonTest test = new PersonTest(name);
        System.out.println(test.getName().getFirstName());
        name.setFirstName("猪");
        System.out.println(test.getName().getFirstName());

    }
}
