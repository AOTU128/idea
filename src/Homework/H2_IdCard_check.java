//我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
// 请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
// 规则为：号码为18位，不能以数字 0 开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。 440682200308134044
package Homework;

import java.util.Scanner;

public class H2_IdCard_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入身份证： ");
        String s = sc.next();
        if (check(s)) {
            System.out.println("正确！");
        } else {
            System.out.println("错误！");
        }
    }

    public static boolean check(String s) {
        // 不能以数字 0 开头，最后一位可以是数字或者大写字母X。
        if (!(s.length() == 18) && s.charAt(0) == '0') {
            return false;
        }
        if (!(((s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9') || s.charAt(s.length() - 1) == 'X'))) {
            return false;
        }

        for (int i = 1; i < s.length() - 1; i++) { // 前17位只可以是数字
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                return false;
            }
        }

        return true;
    }
}
