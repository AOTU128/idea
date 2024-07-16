////输入一个字符串，里面有 若干 单词组成，统计最后一个单词的长度
//方法二：从后往前倒着遍历，需要空格停止计数
package Test;

import java.util.Scanner;

public class P21_Number_of_word2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S, s = "";
        System.out.print("请输入一个字符串: ");
        S = sc.nextLine();
        System.out.println(S);

        int n = 0;
        for (int i = S.length() - 1; i > 0; i--) {
            if (S.charAt(i) == ' ') {
                s = S.substring(i + 1); //从发现空格后面开始截取空格
                break;
            } else {
                n++;
            }
        }
        System.out.println("最后一个单词是长度为 " + n + " 的 " + s);
    }
}
