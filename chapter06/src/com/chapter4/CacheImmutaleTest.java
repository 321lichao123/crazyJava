package com.chapter4;

public class CacheImmutaleTest {
    private static int MAX_SIZE = 10;
    private static CacheImmutaleTest[] cacheArr = new CacheImmutaleTest[MAX_SIZE];
    private static int pos = 0;
    private final String name;

    public CacheImmutaleTest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static CacheImmutaleTest valueOf(String name) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (cacheArr[i] != null && cacheArr[i].getName().equals(name)) {
                return cacheArr[i];
            }
        }
        if (pos == MAX_SIZE) {
            cacheArr[0] = new CacheImmutaleTest(name);
        } else {
            cacheArr[pos++] = new CacheImmutaleTest(name);
        }
        return cacheArr[pos-1];
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj != null && obj.getClass() == CacheImmutaleTest.class) {
            CacheImmutaleTest cObj = (CacheImmutaleTest) obj;
            return name.equals(cObj.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public static void main(String[] args) {
        CacheImmutaleTest c1 = CacheImmutaleTest.valueOf("hello");
        CacheImmutaleTest c2 = CacheImmutaleTest.valueOf("hello");
        System.out.println(c1 == c2);
    }
}
