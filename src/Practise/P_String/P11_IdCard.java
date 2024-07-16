//输入身份证获取生日和性别
package Practise.P_String;  //430682200308134044

import java.util.Scanner;

public class P11_IdCard {
    public static void main(String[] args) {
        String idNumber;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入身份证: ");
            idNumber = sc.next();
            if (idNumber.length() == 18) {
                break;
            }
        }

        String year, month, day;
        char sex;
        int a;
        year = idNumber.substring(6, 10);
        month = idNumber.substring(10, 12);
        day = idNumber.substring(12, 14);
        sex = idNumber.charAt(16); //单个字符获取


        a = sex - '0'; //'0'在ASCII中是48
        if (a % 2 == 0) {
            sex = '女';
        } else {
            sex = '男';
        }

//        System.out.println("性别数字："+a);
        System.out.println("人物信息: ");
        System.out.println("出生年月日: " + year + "年" + month + "月" + day + "日");
        System.out.println("性别为：" + sex);

    }
}
