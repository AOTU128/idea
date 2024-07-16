//键盘录入一个字符串
// 要求1:长度为小于等于9
//要求2:只能是数字(将内容变成罗马数字)
//下面是阿拉伯数字跟罗马数字的对比关系:
//I-1、Ⅱ-2、Ⅲ-3、I-4、V-5、Ⅵ-6、-7、Ⅷ-8、IX-9注意点:
//罗马数字里面是没有0的
//如果键盘录入的数字包含0，可以变成""(长度为8的字符串)
package Test;

import java.util.Scanner;

public class P16_Roman_numerals {
    public static void main(String[] args) {
        String s1;
        char[] c = {' ', 'I', 'Ⅱ', 'Ⅲ', 'Ⅳ', 'V', 'Ⅵ', 'Ⅶ', 'Ⅷ', 'Ⅸ'}; //定义一个字符数组c,存放罗马数字
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        int sign = 0;
        while (true) { //如果字符串超出9位则持续输入
            s1 = sc.next();
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) < '0' || s1.charAt(i) > '9') {
                    System.out.println("请输入数字！");
                    sign = 1;
                    break;
                }
            }
            if (s1.length() > 9) {
                System.out.println("请输入9位以下的字符串！");
            } else if (sign == 0 ) {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb = sb.append(s1); //将键盘中输入的字符串s1添加到sb中

        for (int i = 0; i < s1.length(); i++) {
            sb.setCharAt(i, c[i+1]); //将sb中的第i个字符替换为c中的第i+1个字符
        }
        s1 = sb.toString(); //将sb转换为字符串
        System.out.println(s1);
    }
}

