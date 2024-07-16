//生成验证码
//内容：可以是小写字母，也可以是大写字母，还可以是数字
//规则：
//1.长度为5       2.内容中是四位字母，1位数字。      3.其中数字只有1位，但是可以出现在任意的位置。

package Test;

import java.util.Random;

public class P19_auto_code {
    public static void main(String[] args) {
        char[] ABC = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0',};
        char[] s = new char[5];
        Random r = new Random();

        for (int i = 0; i < 4; i++) { //生成四个字母
            int number = r.nextInt(52);
            s[i] = ABC[number];
        }
        int number = r.nextInt(10); //生成随机数拼接在最后一位
        s[4] = (char) ('0' + number); //把数字强转成字符，并拼接到字符串最后

        int num = r.nextInt(s.length); //生成随机数，把最后一个数字在数组中任意调乱
        char t = s[4];
        s[4] = s[num];
        s[num] = t;


        String result = new String(s); //把字符数组变成字符串
        System.out.println(result); //打印验证码

    }
}
