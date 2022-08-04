package work.D010909.实验作业1;
//4、实验4 Iterator接口
import java.util.Iterator;
import java.util.LinkedList;
//1.包:ss;类:My4
public class T04 {
    public static void main(String[] args) {
//2.在main()中该声明一个ArrayList对象list，并用ArrayList空参构造方法实例化
        LinkedList list = new LinkedList();
//(1)为该集合中添加咱们班级里，你的学号前后的6个学生的姓名
        list.add("于董杰");
        list.add("宋梦雨");
        list.add("张佳欣");
        list.add("杜新宇");
        list.add("朱文涛");
        list.add("贾少鸣");
//(2)调用size()方法输出该集合中元素的个数
        System.out.println("集合中元素的个数：" + list.size());
//(3)删除for循环，使用Iterator对象，利用while循环遍历集合，并输出每一个元素的值
        System.out.println("使用Iterator对象，利用while循环遍历集合:");
        Iterator i = list.iterator();
        while (i.hasNext()) {
            String str1 = (String)i.next();
            System.out.println(str1+"\t");
        }
    }
}