//给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式

package Test;

import java.util.Scanner;

public class P20_String_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个字符串：");
        String A = sc.next();
        System.out.print("请输入第二个字符串：");
        String B = sc.next();
        String result = F(A, B);
        System.out.println("结果是：" + result);
    }

    public static String F(String A, String B) {
        int a = 0, b = 0;
        for (int i = 0; i < A.length(); i++) {
            a = a * 10;
            a = a + (A.charAt(i) - '0');
        }
        for (int i = 0; i < B.length(); i++) {
            b = b * 10;
            b = b + (A.charAt(i) - '0');
        }
        int sum = a * b;
        String result = sum + ""; // 整数加上 "" 就变成字符串啦 （字符串和任意类型相加，结果通通变成字符串）
        return result;

    }
}