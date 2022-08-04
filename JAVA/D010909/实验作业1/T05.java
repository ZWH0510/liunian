package work.D010909.实验作业1;
//实验5 foreach循环
import java.util.LinkedList;
//1.包:ss;类:My5
public class T05 {
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
//(1)删除Iterator对象和while循环，使用for...each语句遍历集合，并输出每个元素的值
        System.out.println("使用for...each语句遍历集合:");
        for (Object number:list){
            System.out.println(number+"\t");
        }
    }
}
