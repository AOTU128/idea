//调正字符串                                                                1        2        3        4      5
//把字符串A “abcde” 第一轮变成 “bcdea” (每一轮把第一个字符放到最后) abcde -> bcdea -> cdeab -> deabc -> eabcd ->abcde
//若干操作后，直到字符串A等于字符串B，则完成
//测试数 A: abcde B:cdeab

package Test;

import java.util.Scanner;

public class P17_Adjust_the_string {
    public static void main(String[] args) {
        String A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个字符串：");
        A = sc.next();
        System.out.print("请输入第二个字符串：");
        B = sc.next();
        StringBuilder sb1 = new StringBuilder();

        sb1.append(A);

        //旋转字符串
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                break;
            } else {
                char start = sb1.charAt(0); //获取第0位
                String end = sb1.substring(1); //从第一位开始截取到最后一位 （1-n）

                sb1= new StringBuilder(end).append(start); //(表达式1) 把从第一位开始到结束和第0位重新拼在一起再重新赋值
              /*  sb1 = new StringBuilder(); // (表达式2) /重新new一次，就相当于清空当前sb1的内容
                sb1.append(end);
                sb1.append(start) */

                A= sb1.toString();
            }
        }

        System.out.println(A.equals(B));
        System.out.println(A);
        System.out.println(B);
    }
}
