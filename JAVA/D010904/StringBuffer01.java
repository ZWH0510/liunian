package work.D010904;

public class StringBuffer01 {

    public static void main(String[] args) {

        //1.定义add方法
        //(1)定义一个字符串缓冲区
        StringBuffer str1 = new StringBuffer();
        //(2)在末尾添加字符串"abcdefg"
        str1.append("abcdefg");
        //(3)打印"append添加结果："
        System.out.println("append添加结果：" + str1);
        //(4)在第3个字符位置处插入字符串"123"
        str1.insert(3, "123");
        //(5)打印"insert添加结果："
        System.out.println("insert添加123的结果：" + str1);
        System.out.println("------------------------");

        //2.定义remove方法
        //(1)定义一个字符串缓冲区"abcdefg"
        StringBuffer str2 = new StringBuffer("abcdefg");
        //(2)删除第2个字符到第5个字符
        str2.delete(2, 5);
        //(3)打印"删除指定位置结果："
        System.out.println("删除第2个字符到第5个字符:" + str2);
        //(4)删除第3个字符
        str2.delete(3, 4);
        //(5)打印"删除指定位置结果："
        System.out.println("删除第3个字符" + str2);
        //(6)清空缓冲区
        str2.delete(0,str2.length());
        //(7)打印"清空缓冲区结果："
        System.out.println("清空缓冲区结果："+str2);
        System.out.println("------------------------");


        //3.定义alter方法
        //(1)定义一个字符串缓冲区"abcdef"
        StringBuffer str3 = new StringBuffer("abcdef");
        //(2)修改第2个字符为'p'
        str3.replace(1, 2, "p");
        //(3)打印"修改指定位置字符结果："
        System.out.println("修改第2个字符为'p':" + str3);
        //(4)替换第2个字符和第3个字符为"qq"
        str3.replace(1, 3, "qq");
        //(5)打印"替换指定位置字符串结果："
        System.out.println("替换第2个字符和第3个字符为'qq':" + str3);
        //(6)打印"字符串翻转结果："
        System.out.println("字符串翻转结果：" + str3.reverse());
    }
}




