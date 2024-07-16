//已知正确的用户名和密码,请用程序实现模拟用户登录,总共三次机会,登录之后,给出相应的提示
package Practise.P_String;

import java.util.Scanner;

public class P4_User_Login {
    public static void main(String[] args) {
        //定义两个变量记录正确的用户名和密码
        String username = "cc";
        String password = "123456";

        //实现模拟用户登录,总共三次机会,登录之后,给出相应的提示
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入用户名：");
            String name = sc.next();
            System.out.print("请输入密码：");
            String pwd = sc.next();
            System.out.println();

            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                if (i == 2) { //i=2时,输入错误的用户名和密码,提示账户已被锁定
                    System.out.println("登录失败，你的账户已被锁定！");
                } else {
                    System.out.println("登录失败，你还有" + (3 - (i + 1)) + "次机会！");// 3 - (i + 1) /2-i
                }
            }

        }

    }
}
