//手机号屏蔽(使用函数:substring)
package Practise.P_String;

import java.util.Scanner;

public class P10_Number_Shield_teacher {
    public static void main(String[] args) {
        String phoneNumber, phoneS;
        Scanner sc = new Scanner(System.in);

        while (true) { //如果不是11位则持续输入
            System.out.print("请输入11位手机号码: ");
            phoneNumber = sc.next();
            if (phoneNumber.length() == 11) {
                break;
            }
        }
        phoneS = phoneNumber.substring(0, 3) + "****";  //截取手机号码前三位 (包左不包右,不包括4) 再给中间四位赋上*
        phoneS = phoneS + phoneNumber.substring(7);
        System.out.println(phoneS);

    }
}
