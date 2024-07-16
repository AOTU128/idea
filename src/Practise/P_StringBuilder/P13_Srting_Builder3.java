//链式编程:
//当我们调用一个方法的时候,不需要用变量接收他的结果,可以继续调用其他方法
package Practise.P_StringBuilder;

import java.util.Scanner;

public class P13_Srting_Builder3 {
    public static void main(String[] args) {
        //把调用后的字符串的结果再调用其他方法 (依赖前一个方法的结果再去调用下一个函数)
        //但length()返回的是整数,后面就不能再定义方法了
        //调用getString()方法,获取键盘输入的字符串,然后substring(1)从第一个字符开始截取到最后一位,replace("A", "B")把A替换成B,最后length()获取长度
        int len = getString().substring(1).replace("A", "B").length();
        System.out.println(len);

    }

    public static String getString() { //获取键盘输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串: ");
        String str = sc.next();
        return str;
    }
}
