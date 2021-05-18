package com.practice;

public class Student {
    public String name;
    public int age;
    public char gender;
    public String phone;
    public String address;
    public String email;

    public Student() {}

    public Student(String name, int age, char gender, String phone, String address, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void eat() {
        System.out.println("学生吃饭");
    }

    public void drink() {
        System.out.println("学生喝水");
    }

    public void play() {
        System.out.println("学生在玩");
    }

    public void sleep() {
        System.out.println("学生在睡觉");
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("张三", 18, '男', "12345678908", "北京大院1号", "124675@qq.com");
        students[1] = new Student("李四", 20, '男', "12345675608", "北京大院1号", "124645@qq.com");
        students[1] = new Student("李梅", 18, '女', "12345675678", "北京大院1号", "124667@qq.com");
    }
}
