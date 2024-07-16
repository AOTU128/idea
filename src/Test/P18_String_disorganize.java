//键盘输入任意字符串，打乱里面的内容 //测试数： abcdef123
package Test;

import java.util.Random;
import java.util.Scanner;

public class P18_String_disorganize {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        s = sc.next();
        char[] Arr = s.toCharArray(); //把字符串变成数组
        Random r = new Random();
        for (int i = 0; i < Arr.length; i++) { //每轮生成随机数把数组调乱
            int number =r.nextInt(Arr.length-1);
            char t=Arr[i];
            Arr[i]=Arr[number];
            Arr[number]=t;
        }

        //把字符数组重新变回字符串
        String result =new String(Arr); //创建一个字符串，把字符数组传递进去

        System.out.println(s);
        System.out.println(result);
    }

}
