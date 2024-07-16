// 把敏感词替换（初阶版）使用replace()函数
package Practise.P_String;

import java.util.Scanner;

public class P12_String_Substitution1 {
    public static void main(String[] args) {
        String talk;
        String[] arr = {"TMD", "CNM", "SB"}; //创建敏感词 词库
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你想说的话：");
        talk = sc.next();

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
