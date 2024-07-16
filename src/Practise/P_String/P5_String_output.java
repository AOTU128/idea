//键盘录入一个字符串并遍历字符串
package Practise.P_String;

import java.util.Scanner;

public class P5_String_output {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s1 = sc.next();
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i)); //charAt()方法返回指定索引处的字符,然后输出


        }
    }
}
