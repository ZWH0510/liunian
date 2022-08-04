package work.D010909.实验作业2;
//实验1 Collection集合
import java.util.ArrayList;
import java.util.Collection;
//1.包:ss;类:My1
public class T01 {
    public static void main(String[] args) {
//2.在main()中该声明一个Collection集合对象c1，并用ArrayList空参构造方法实例化
        Collection c1 = new ArrayList();
//(1)向该集合中添加对象
        c1.add("111");
        c1.add("222");
        c1.add("333");
        c1.add("444");
        c1.add("555");
        c1.add("666");
        c1.add("777");
        c1.add("888");
        c1.add("999");
//(2)调用size()方法输出该集合中元素的个数
        System.out.println("调用size()方法输出该集合中元素的个数:" + c1.size());
//(3)输出该集合c1的内容
        System.out.println("输出该集合c1的内容:" + c1);
//(4)从集合中删除对象“666”
        c1.remove("666");
//(5)第2次输出该集合c1的内容
        System.out.println("第2次输出该集合c1的内容:" + c1);
//(6)判断该集合中是够包含对象"666"并输出判断结果
        System.out.println("判断该集合中是够包含对象\"666\":" + c1.contains("666"));
//(7)判断该集合中是够包含对象"888"并输出判断结果
        System.out.println("判断该集合中是够包含对象\"888\":" + c1.contains("888"));
//(8)声明另一个Collection集合对象c2，并用ArrayList空参构造方法实例化
        Collection c2 = new ArrayList();
//(9)把集合c1中的所有元素全部添加到集合c2中
        c2.addAll(c1);
//(10)输出该集合c2的内容
        System.out.println("输出该集合c2的内容:" + c2);
//(11)清空集合c2中的元素
        c2.clear();
//(12)判断集合c2是否为空并输出判断结果
        System.out.println("判断集合c2是否为空:" + c2.isEmpty());
//(13)将集合c1转换成数组s
        System.out.print("将集合c1转换成数组s:");
        Object s[] = c1.toArray();
        for (int i = 0; i < s.length; i++) {
//(14)输出数组s中的元素，并用逗号隔开。
            System.out.print(s[i] + ",");
        }
    }
}
