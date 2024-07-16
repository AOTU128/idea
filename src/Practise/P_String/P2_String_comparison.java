//字符串比较
package Practise.P_String;

public class P2_String_comparison {
    public static void main(String[] args) {
        //1.创建两个字符串对象
        String s1 = new String("abc"); //引用数据类型
        String s2 = "abc"; //基本数据类型

        //2.使用==比较两个字符串对象  （基本数据类型：比的是数据值,引用数据类型:比的是地址值）
        System.out.println("第一种: " + (s1 == s2)); // false

        //3.比较字符串对象中的内容是否相等
        boolean result1 = s1.equals(s2);
        System.out.println("第二种: " + result1); // true

        //4.比较字符串对象中的内容是否相等（忽略大小写）
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println("第三种: " + result2); // true


    }
}
