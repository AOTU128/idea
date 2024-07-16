//对称字符串 ( 12321 √    123 × ) 正反读顺序都一样
package Practise.P_StringBuilder;

import java.util.Scanner;

public class P14_Symmetric_strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串: ");
        String str1 = sc.next();

        sb.append(str1); //把字符串添加到StringBuilder
        sb.reverse(); //利用StringBuilder,把字符串反转
        String str2 = sb.toString(); //把StringBuilder变回字符串并用str2接收

        System.out.println("反转前: " + str1);
        System.out.println("反转后: " + str2);

        if (str1.equals(str2)) {
            System.out.println("对称字符串!");
        }else {
            System.out.println("不是对称字符串!");
        }
    }
}
