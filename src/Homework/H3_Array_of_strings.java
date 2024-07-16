//定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
//要求：1、如果传递的参数为空，返回null
//     2、如果传递的数组元素个数为0，返回[]
//     3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]

package Homework;

import java.util.Scanner;
import java.util.StringJoiner;

public class H3_Array_of_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("请输入10个数字： ");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("数组： " + Array_of_strings(arr)); //直接调用函数就输出

    }

    public static String Array_of_strings(int[] arr) {
        StringJoiner SJ = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            SJ = SJ.add(arr[i] + ""); //使用" "  将数字转换成字符串再添加
        }
        String S = SJ.toString();
        return S;
    }
}
