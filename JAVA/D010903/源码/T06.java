package work.D010903;

//实验6 字符串的截取和分割
//一.测试类T06
public class T06 {
    //1.定义main方法
    public static void main(String[] args) {

//(1)通过字符串常量直接赋值的形式初始化一个String对象,字符串为"羽毛球-篮球-乒乓球"
String str1 = "羽毛球-篮球-乒乓球";
//(2)打印所创建的字符串对象从第5个字符截取到末尾的结果
        System.out.println("字符串对象从第5个字符截取到末尾的结果为:"+str1.substring(5));
//(3)打印所创建的字符串对象从第5个字符截取到第6个字符的结果
        System.out.println("字符串对象从第5个字符截取到第6个字符的结果为:"+str1.substring(5,str1.length()-4));
//(4)打印"分割后的字符串数组中的元素依次为:"字样
        System.out.println("分割后的字符串数组中的元素依次为:");
//(5)根据符号"-"将所创建的字符串对象进行分割,并将分割的结果存入字符串数组中
        String strarr[]  = str1.split("-");
        System.out.println(strarr[0]);
        System.out.println(strarr[1]);
        System.out.println(strarr[2]);
//(6)打印字符串数组中的每一个字符串,每个字符串之间用","隔开
        String[]firstArray=str1.split("\\-");
        System.out.println();
    }
}
