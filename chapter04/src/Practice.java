import org.junit.Test;

import java.util.Arrays;

public class Practice {
    @Test
    public void jiujiu() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( i + " * " + j + " = " + (i * j) + " ");
            }
            System.out.println("\n");
        }
    }

    @Test
    public void loopTriangle() {
        // 控制输出几行的星星
        int count = 6;
        // 最外层控制输出几行的星星
        for (int i = 0; i < count; i++) {
            // 控制输出多少空格
            for (int j = 1; j <= count - i; j++) {
                System.out.print(" ");
            }
            // 控制输出多少星星
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    @Test
    public void realizationSubString() {
        String str = "好好学习,Java";
        int start = 3;
        int end = 6;
        int strLen = str.length();
        char[] strArr = new char[strLen];
        for (int i = 0; i < strLen; i++) {
            strArr[i] = str.charAt(i);
        }
        char[] chars = Arrays.copyOfRange(strArr, start, end);
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
        }
        System.out.println(result);
        System.out.println(str.substring(3, 6));
    }

    @Test
    public void transformationDouble() {
        double num = 1006.333;
        String[] hanArr = new String[]{"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[] comArr1 = new String[]{"分", "角"};
        String[] comArr2 = new String[]{"元", "十", "百", "千"};
        // 标志是否存在相邻的零
        boolean isFlag = true;
        // 输出的结果
        String result = "";
        // 获取整数部分
        long integer = (long) num;
        // 获取小数部分
        long decimal = Math.round((num - integer) * 100);
        // 获取整数、小数的字符串
        String integerStr = String.valueOf(integer);
        String decimalStr = String.valueOf(decimal);
        // 分别将整数和小数转为汉语写法
        int integerLen = integerStr.length();
        int decimalLen = decimalStr.length();
//        System.out.println(integerLen + " : " + integerStr);
        for (int i = 0; i < integerLen; i++) {
            int intNum = integerStr.charAt(i) - 48;
            if (i != integerLen - 1 && intNum != 0) {
                result += (hanArr[intNum] + comArr2[integerLen - 1 - i]);
            } else if(isFlag && intNum == 0) {
                isFlag = false;
                result += hanArr[intNum];
            } else if(!isFlag && intNum != 0) {
                isFlag = true;
                result += (hanArr[intNum] + comArr2[integerLen - 1 - i]);
            }
        }
        for (int i = 0; i < decimalLen; i++) {
            int intNum = decimalStr.charAt(i) - 48;
            if (i != integerLen - 1 && intNum != 0) {
                result += (hanArr[intNum] + comArr1[i]);
            } else {
                result += hanArr[intNum];
            }
        }
        System.out.println(result);
    }
}
