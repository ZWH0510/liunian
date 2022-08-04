package work.D010903;
// 实验3 字符串的转换操作(将字符串转为数组/整数转为字符串/字符串中的字符转为大写)

//一.测试类T03
public class T03 {
    //1.定义main方法
    public static void main(String[] args) {
        //(1)通过字符串常量直接赋值的形式初始化一个String对象,字符串为"abcd"
        String str = "abcd";
        //(2)打印"将字符串转为字符数组后的结果:"字样
        System.out.println("将字符串转为字符数组后的结果：");
        //(3)将上面的字符串对象转换为字符数组
        String[] s = str.split(",");
        for (String each : s) {
            System.out.println(each);
        }
        //(4)打印出字符数组中的每一个字符,格式为只有字符之间加","隔开(例:x,x,x,x)
        System.out.println(str);
        //(5)打印将int值12转换为String类型之后的结果
        int a = 12;
        String b = String.valueOf(a);
        System.out.println("int值12转换为String类型之后的结果：" + b);
        //(6)打印出上面字符串对象的大写形式
        System.out.println("字符串对象的大写形式为：" + str.toUpperCase());



    }
}