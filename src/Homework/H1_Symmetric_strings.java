//请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
// 例如："abcba"、"上海自来水来自海上"均为对称字符串。
package Homework;

import java.util.Scanner;

public class H1_Symmetric_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串： ");
        String s1 = sc.next();
        String s2 = Symmetric(s1);
        if (s1.equals(s2)) {
            System.out.println("对称字符串！");
        } else {
            System.out.println("不是对称字符串！");
        }
    }

    public static String Symmetric(String s) {
        StringBuilder S = new StringBuilder(s);
        S = S.reverse(); //把传入进来的字符串进行反正并返回
        s = S.toString();
        return s;
    }
}
