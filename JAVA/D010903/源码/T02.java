package work.D010903;

//实验2 字符串的基本操作(获取字符串长度/获取指定位置的字符/获取指定字符或字符串的位置)
//一.测试类T02
public class T02 {
    //1.定义main方法
    public static void main(String[] args) {
        //(1)通过字符串常量直接赋值的形式初始化一个String对象,字符串为"ababcdedcba"
        String str = "ababcdedcba";
        //(2)打印字符串长度，即字符个数
        System.out.println("字符串长度为:" + str.length());
        //(3)打印字符串中第一个字符
        System.out.println("符串中第一个字符为：" + str.substring(0, 1));
        //(4)打印字符c第一次出现的位置
        System.out.println("符串c第一次出现的位置为：" + str.indexOf('c'));
        //(5)打印字符c最后一次出现的位置
        System.out.println("字符c最后一次出现的位置为：" + str.lastIndexOf('c'));
        //(6)打印子字符串"ab"第一次出现的位置
        System.out.println("子字符串\"ab\"第一次出现的位置为：" + str.indexOf("ab"));
        //(7)打印子字符串"ab"最后一次出现的位置
        System.out.println("子字符串\"ab\"最后一次出现的位置为：" + str.lastIndexOf("ab"));
    }
}