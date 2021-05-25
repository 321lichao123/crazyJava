package com.chapter2;

class Person {
    public String name;
    public String idStr;

    public Person() {
    }

    public Person(String name, String idStr) {
        this.name = name;
        this.idStr = idStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null & obj.getClass() == Person.class) {
            Person pObj = (Person) obj;
            if (this.idStr == pObj.idStr) {
                return true;
            }
        }
        return false;
    }
}

public class OverrideEqualsTest {
    public static void main(String[] args) {
        Person p1 = new Person("孙悟空", "1234");
        Person p2 = new Person("孙行者", "12345");
        Person p3 = new Person("孙悟饭", "1234");
        System.out.println(p1.idStr.equals(p2.idStr));
        System.out.println(p1.idStr.equals(p3.idStr));
    }
}
