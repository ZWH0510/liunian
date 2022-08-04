package work.D010909.实验作业1;
//3、实验3 LinkedList集合
import java.util.LinkedList;
//1.包:ss;类:My3
public class T03 {
    public static void main(String[] args) {
//2.在main()中该声明一个LinkedList对象list，并用LinkedList空参构造方法实例化
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
//(3)向该集合中索引为3的位置添加一个元素
        list.add(3, "XXX1");
//(4)向该集合中第一个位置添加一个元素
        list.add(0, "XXX2");
//(5)第1次输出所有元素的值
        System.out.println("第1次输出所有元素的值：" + list);
//(6)删除索引为5的元素
        list.remove(5);
//(7)第2次输出所有元素的值
        System.out.println("第2次输出所有元素的值：" + list);
//(8)删除集合中第一个元素
        list.remove(0);
//(9)第3次输出第一个元素
        System.out.println("第3次输出第一个元素的值：" + list.getFirst());
//(10)第4次输出所有元素的值
        System.out.println("第4次输出所有元素的值：" + list);
    }
}