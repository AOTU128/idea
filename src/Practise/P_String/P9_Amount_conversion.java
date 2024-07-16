// 将一个金额转换为大写的形式 eg. 123 -> 壹佰贰拾叁元
package Practise.P_String;

import java.util.Scanner;

public class P9_Amount_conversion {
    public static void main(String[] args) {
        int amount;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入一个金额: ");
            amount = sc.nextInt();
            if (amount >= 0 && amount <= 9999999) {
                break;
            } else {
                System.out.println("金额无效!");
                System.out.println();
            }
        }
        conversion(amount); //调用转换成大写的方法
    }

    public static void conversion(int amount) {
        String s = "";
        String result = "";
        char[] arr = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        char[] brr = {'佰', '拾', '万', '仟', '佰', '拾', '元'};

        while (amount != 0) { // 把数字逐个转换成大写
            int a = amount % 10;
            s = arr[a] + s;
            amount = amount / 10;
        }
        while (s.length() < 7) { // 前面补零 (补齐七位)
            s = '零' + s;
        }

//        System.out.println("第一遍: " + s);
//        System.out.println("长度: " + s.length());

        for (int i = 0; i < s.length(); i++) { //插入单位
            result = result + s.charAt(i) + brr[i];
        }
        System.out.println(result); //输出赋值好的数组
    }
}