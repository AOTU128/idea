package Practise.P_StringBuilder;

public class P13_Srting_Builder2 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();

        //2.添加字符串 (链式编程)
        sb.append("aaa").append("bbb").append("ccc").append("ddd");


        System.out.println(sb); //aaabbbcccddd

        //3.再把StringBuilder变回字符串 (即可使用字符串的函数)
        String str=sb.toString();
        System.out.println(str); //aaabbbcccddd

    }
}
