//统计字符串在另一个字符串出现的次数
//使用两个方法：
// 1.查找参数字符串str在调用方法的字符串中第一次出现的索引，如果不存在，返回-1
// public int indexOf(String str)
//
// 2.截取字符串，从索引beginIndex（包含）开始到字符串的结尾
// public String substring(int beginIndex)

//现有如下文本："Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"。
// 请编写程序，统计该文本中"Java"一词出现的次数。
package Homework;

import java.util.Scanner;

public class H4_Number_of_words {
    public static void main(String[] args) {
        int t = 0, n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s = sc.nextLine(); //输入一整行

        String searchNum;
        System.out.print("请输入您想查找的字符: ");
        searchNum=sc.nextLine();

        while (true) {
            t = s.indexOf(searchNum, t); //从索引t的位置开始查找searchNum 并用t接收所在的位置
            if (t == -1) { //如果返回-1则表示从t索引到最后没有再出现过searchNum
                break;
            }
            t = t + searchNum.length(); //t为当前searchNum所在字母的第一个位置,加上长度则t到达searchNum所在字母的最后一个位置,避免下次查找时重叠
            n++;
        }
        System.out.println(searchNum + " 一共出现了 " + n + " 次 !");

    }
}