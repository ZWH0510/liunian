package work.D010903;
//一.测试类T05
public class T05 {
    //1.定义main方法
    public static void main(String[] args) {
//实验5 字符串的判断操作(判断字符串是否以制定的字符串开始\结束,是否包含制定的字符串,字符串是否为空)

//(1)通过字符串常量直接赋值的形式初始化一个String对象,字符串为"String"
        String str1 = "String";
//(2)通过字符串常量直接赋值的形式初始化一个String对象,字符串为"str"
        String str2 = "str";
//(3)打印判断创建的第一个字符串对象是否以字符串Str开头的结果
        System.out.println("创建的第一个字符串对象是否以字符串Str开头的结果:" + str1.startsWith("Str"));
//(4)打印判断创建的第一个字符串对象是否以字符串ng结尾的结果
        System.out.println("创建的第一个字符串对象是否以字符串ng结尾的结果:" + str1.endsWith("ng"));
//(5)打印判断创建的第一个字符串对象是否包含字符串tri的结果
        System.out.println("创建的第一个字符串对象是否包含字符串tri的结果:" + str1.contains("tri"));
//(6)打印判断创建的第一个字符串对象字符串是否为空的结果
        System.out.println("创建的第一个字符串对象字符串是否为空的结果:" + str1.isEmpty());
//(7)打印判断以上两个创建的字符串对象是否相等的结果
        System.out.println("字符串对象是否相等:" + str1.equals(str2));
    }
}
