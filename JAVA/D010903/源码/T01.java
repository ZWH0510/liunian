package work.D010903;


//一.测试类T01

public class T01 {
    //1.定义main方法
    public static void main(String[] args) {

        //(1)使用String的构造方法创建一个空字符串
        String str1 = " ";
        //(2)使用String的构造方法创建一个内容为abcd的字符串
        String str2 = "abcd";
        //(3)创建一个内容为："字符数组" 的字符串
        String str3 = "字符数组";
        //(4)打印字符串"a"拼接上面创建的第一个 字符串对象 和 字符串 "b"
        System.out.println("字符串\"a\":"+str2.charAt(0));
        // System.out.println(a.concat("字符串\"a\"拼接上面创建的第一个 字符串对象 和 字符串 \"b\""+str1));
        //(5)打印创建的第二个字符串对象
            System.out.println("第二个字符串对象:"+str2);
        //(6)打印创建的第三个字符串对象
            System.out.println("第三个字符串对象:"+str3);
        }
    }