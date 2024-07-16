//手机号屏蔽
package Practise.P_String;

import java.util.Scanner;

public class P10_Number_Shield {
    public static void main(String[] args) {
        String phoneNumber;
        Scanner sc = new Scanner(System.in);

        while (true) { //如果不是11位则持续输入
            System.out.print("请输入11位手机号码: ");
            phoneNumber = sc.next();
            if (phoneNumber.length() == 11) {
                break;
            }
        }
        char[] phoneArr = phoneNumber.toCharArray(); //注意加密赋值
        for (int i = 3; i < 7; i++) {
            phoneArr[i] = '*';
        }

        System.out.println(phoneArr); //输出加密好的手机号
    }

}
