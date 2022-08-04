package work.D010909.实验作业1;
import java.util.ArrayList;
//1、实验1 ArrayList集合1
public class T01 {
    public static void main(String[] args) {
        //2.在main()中该声明一个ArrayList对象list，并用ArrayList空参构造方法实例化
        ArrayList list = new ArrayList();
        //(1)为该集合中添加咱们班级里，你的学号前后的6个学生的姓名
        list.add("于董杰");
        list.add("宋梦雨");
        list.add("张佳欣");
        list.add("杜新宇");
        list.add("朱文涛");
        list.add("贾少鸣");
        //(2)调用size()方法输出该集合中元素的个数
        System.out.println("该集合中元素的个数：" + list.size());
        //(3)使用for循环遍历集合，并输出每一个元素的值
        System.out.println("遍历集合：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+"\t");
        }
        System.out.println();
    }
}