public class PrimitiveTransferTest2 {
    public static void swap(DateWap dw) {
        int temp = dw.a;
        dw.a = dw.b;
        dw.b = temp;
        System.out.println("warp里面的a的值是：" + dw.a + "，b的值是" + dw.b);
    }

    public static void main(String[] args) {
        DateWap dw = new DateWap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("warp外面的a的值是：" + dw.a + "，b的值是" + dw.b);

    }
}

class DateWap {
    int a;
    int b;
}