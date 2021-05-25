package com.chapter9;

public enum Gender implements GenderDes {
    // MALE, FEMALE;
    // 第一种写法：
    // public String name;
    // 第二种写法
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        switch (this) {
//            case MALE:
//                if ("男".equals(name)) {
//                    this.name = name;
//                } else {
//                    System.out.println("参数错误");
//                    return;
//                }
//                break;
//            case FEMALE:
//                if ("女".equals(name)) {
//                    this.name = name;
//                } else {
//                    System.out.println("参数错误");
//                    return;
//                }
//                break;
//        }
//    }
    // 第三种写法：枚举类应该是不可变类
    MALE("男") {
        public void info() {
            System.out.println("这是表示男性");
        }
    }, FEMALE("女") {
        public void info() {
            System.out.println("这是表示女性");
        }
    };
    private final String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    // 这样重写接口方法则是通用一个操作
//    @Override
//    public void info() {
//        System.out.println("这是一个定义性别的类型");
//    }
}
