//SrtingBuilder  (可以直接对字符串修改并产生变化)
package Practise.P_StringBuilder;

public class P13_Srting_Builder1 {
    public static void main(String[] args) {
        // 1.创建对象
        StringBuilder sb = new StringBuilder("投币");

//        2.添加元素 append()
        sb.append(1);
        sb.append(2.3);
        sb.append(true); //直接逐一拼接: 12.3true

        sb.reverse(); //反转内容: eurt3.21币投 (直接对字符串发生变化)

        int length = sb.length(); //获取字符串长度
        System.out.println("长度: " + length);


        // 3.打印
        // 普及:因为StringBuilder是java已经写好的类,java在底层对他做了一些特殊的操作,打印对象不是地址值而是属性值
        System.out.println(sb);
    }
}
