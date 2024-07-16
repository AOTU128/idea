//定义一个方法,实现字符串反转,键盘录入一个字符串,调用该方法后,控制台输出结果
package Practise.P_String;

import java.util.Scanner;

public class P8_String_inversion {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串: ");
        s = sc.next();
        s = inversion(s);
        System.out.print(s);
    }

    public static String inversion(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            // charAt()方法返回指定索引处的字符,利用字符串拼接操作实现字符串反转
            result = result + s.charAt(s.length() - (i + 1));
        }
        return result;
    }

}
