//输入一个字符串，里面有若干 单词组成，统计最后一个单词的长度
//方法一：从头往后遍历，遇见空格则重新统计单词数
package Test;

import java.util.Scanner;

public class P21_Number_of_word1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S, s = "";
        int n = 0;
        System.out.print("请输入一个字符串：");
        S = sc.nextLine(); //输入一行的字符串

        for (int i = 0; i < S.length(); i++) {
            n++;
            if (S.charAt(i) == ' ') {
                n = 0;
                s = S.substring(i + 1);
            }
        }
        System.out.println("最后一个单词是长度为" + n + "的" + s);
    }

}
