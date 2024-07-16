
package Practise.P_StringJoiner;

import java.util.StringJoiner;

public class P15_String_Joiner1 {
    public static void main(String[] args) {
        //1. 创建一个对象,并指定中间的分隔符
        StringJoiner sj=new StringJoiner(", ","[","]");

        //2. 添加元素
        sj.add("aaa").add("bbb").add("ccc");

        int len=sj.length();
        System.out.println(len); //15 (字符个数含空格)

        //3.打印结果
        System.out.println(sj);

        String str=sj.toString();
        System.out.println(str); // [aaa, bbb, ccc]

    }
}
