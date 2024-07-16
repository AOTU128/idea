//把int数组中的数据按照指定格式拼接成一个字符串，调用该方法并输出结果
package Practise.P_String;

public class P7_String_character {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = arrtostring(arr);
        System.out.println(s);
    }

    public static String arrtostring(int[] a) {
        String s = "[";
        if (a == null) {
            return "";
        }
        if (a.length == 0) {
            return "[]";
        }
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                s = s + a[i] + ']';
                break;
            } else {
                s = s + a[i] + ", ";
            }
        }
        return s;
    }
}