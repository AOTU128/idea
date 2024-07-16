// 创建String对象的方式
package Practise.P_String;

public class P1_String_initialize {
    public static void main(String[] args) {
        //1.使用直接赋值的方式获取一个字符串对象 //需掌握
        String s1 = "abc";
        System.out.println(s1); //abc

        //2.使用new的方式来获取一个字符串对象
        //2-1 空参构造：可以获取一个空白的字符串对象 (不占字节位)
        String s2 = new String();
        System.out.println("@" + s2 + "!"); //@!

        //2-2 传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象 （没啥用）
        String s3 = new String("123");
        System.out.println(s3);

        //2_3 传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象  //需掌握
        //适用场景：修改字符串的内容 （将字符串转换成字符数组，修改字符后，再转变成字符串）
        char[] chs={'e','f','g','h','i','j'};
        String s4= new String(chs); //创建一个新的字符串对象
        System.out.println(s4); //efghij

        //传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象 //需掌握
        //适用场景：以后在网络当前传输的数据其实都是字节信息，我们一般要把字节信息进行转换，转成字符串，此时就要用到这个构造
        byte[] bytes={97,98,99,100,101,102}; //ASCII码表
        String s5= new String(bytes);
        System.out.println(s5); //abcdef

    }
}
