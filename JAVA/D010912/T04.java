package work.D010912;
import java.util.ArrayList;
//    泛型实验
public class T04 {
    public static void main(String[] args) {
//1)创建一个存放String类型元素的ArrayList集合,需要导入java.util包
        ArrayList Str = new ArrayList();
//2)向集合中添加任意两个字符串
        Str.add("熊大");
        Str.add("熊二");
//3)使用for...each遍历集合
        System.out.println("使用for...each语句遍历集合:");
        for (Object name : Str) {
            System.out.println(name + "\t");
        }
//4)打印集合中的元素
        System.out.println("打印集合中的元素:"+Str);
    }
}