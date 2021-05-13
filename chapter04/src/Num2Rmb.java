public class Num2Rmb {
    private String[] hanArr = new String[]{"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾"};
    private String[] uniArr = new String[]{"十", "百", "千"};

    /**
    * @Description: 将浮点数分成整数和小数两部分字符串
    * @Param: num浮点数
    * @return: 返回一个字符串数组
    * @Author: lichao
    * @Date: 2021/5/13 13:37
    */
    private String[] divide(double num) {
        // 获取浮点数的整数部分
        long integer = (long) num;
        // 获取浮点数的小数部分，并转为整数
        int decimal = (int) Math.round((num - integer) * 100);
        return new String[]{String.valueOf(integer), String.valueOf(decimal)};
    }

    private String toHanStr(String numStr) {
        String result = "";
        int length = numStr.length();
        for (int i = 0; i < length; i++) {
            // 获取字符串每一位对应的中文大写数字,char数字类型跟int的数字差48
            int zhong = numStr.charAt(i) - 48;
            // 是否是最后一位并不是零，否则添加单位
            if (i != length - 1 && zhong != 0) {
                result += (hanArr[zhong] + uniArr[length - 2 -i]);
            } else {
                result += hanArr[zhong];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Num2Rmb rmb = new Num2Rmb();
        String[] divide = rmb.divide(2345.67);
        System.out.println(divide);
        String s = rmb.toHanStr("1234");
        System.out.println(s);
    }
}
