package Practise.P_String;

import java.util.Scanner;

public class P3_String_Demo {
    public static void main(String[] args) {
        // 1.假设现在键盘录入一个abc
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1=sc.next(); //键盘录入一个字符串 //选中ctrl+b查看源码

        //2.代码中再定义一个字符串abc
        String s2="abc";

        //3.用==比较,这两个字符串是否相等 (键盘录入是new出来的，而s2是直接赋值的，所以地址值不同)
        System.out.println(s1==s2); //false

        //结论: 以后字符串之间的比较，全部使用equals方法String里面的方法
    }
}
