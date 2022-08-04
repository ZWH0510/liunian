package work.D010903;
//实验4 字符串的替换和去除空格操作

//一.测试类T04
public class T04 {
    //1.定义main方法
    public static void main(String[] args) {
        //(1)通过字符串常量直接赋值的形式初始化一个String对象,字符串为"xxxch05"
        String str1 = "xxxch05";
        //(2)打印上面创建的字符串对象中的xx替换成havct.xx的结果
        System.out.println("字符串对象中的xx替换成havct.xx的结果:"+str1.replace("xxxch05","havct.xx"));
        //(3)通过字符串常量直接赋值的形式初始化一个String对象,字符串为"     x x x c h 0 5     "
        String str2 = "     x x x c h 0 5     ";
        //(4)打印第二次创建的字符串对象去除字符串两端空格后的结果
        System.out.println("第二次创建的字符串对象去除字符串两端空格后的结果："+str2.trim());
        //(5)打印第二次创建的字符串对象去除字符串中所有空格后的结果
        System.out.println("第二次创建的字符串对象去除字符串中所有空格后的结果："+str2.replace(" ",""));
    }
}
