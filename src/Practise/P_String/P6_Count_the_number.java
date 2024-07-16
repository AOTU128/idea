//键盘录入一个字符串,统计字符串中大小写字符及数字字符个数
package Practise.P_String;

import java.util.Scanner;

public class P6_Count_the_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s1=sc.next();
        int big=0,small=0,num=0;
        for(int i=0;i<s1.length();i++) {
            if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
                big++;
            } else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
                small++;
            }else if(s1.charAt(i)>='0' &&s1.charAt(i)<='9'){
                num++;
            }
        }
        System.out.println("大写字母个数："+big);
        System.out.println("小写字母个数："+small);
        System.out.println("数字个数："+num);
    }
}
