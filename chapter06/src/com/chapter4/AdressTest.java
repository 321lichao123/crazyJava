package com.chapter4;

public class AdressTest {
    private final String detail;
    private final String postCOde;

    public AdressTest() {
        this.detail = "";
        this.postCOde = "";
    }

    public AdressTest(String detail, String postCOde) {
        this.detail = detail;
        this.postCOde = postCOde;
    }

    public String getDetail() {
        return detail;
    }

    public String getPostCOde() {
        return postCOde;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null & obj.getClass() == AdressTest.class) {
            AdressTest aObj = (AdressTest) obj;
            if (this.getPostCOde().equals(aObj.getPostCOde())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return detail.hashCode() + postCOde.hashCode() * 31;
    }

    public static void main(String[] args) {
        AdressTest test1 = new AdressTest("123", "456");
    }
}
