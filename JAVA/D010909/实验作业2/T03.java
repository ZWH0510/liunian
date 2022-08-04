package work.D010909.实验作业2;
import java.util.LinkedList;
// LinkedList集合
//1.包:ss;类:My3
public class T03 {
    public static void main(String[] args) {
//2.在main()中该声明一个LinkedList对象list，并用LinkedList空参构造方法实例化
        LinkedList list = new LinkedList();
//(1)为该集合中添加3个学生的姓名
        list.add("李白");
        list.add("杜甫");
        list.add("白居易");
//(2)调用size()方法输出该集合中元素的个数
        System.out.println("输出该集合中元素的个数:" + list.size());
//(3)向该集合中索引为1的位置添加一个学生"小丽"
        list.add(1, "小丽");
//(4)向该集合中第一个位置添加一个学生“小强”
        list.add(0, "小强");
//(5)第1次输出所有元素的值
        System.out.println("第1次输出所有元素的值:" + list);
//(6)删除索引为3的元素
        list.remove(3);
//(7)第2次输出所有元素的值
        System.out.println("第2次输出所有元素的值:" + list);
//(8)删除集合中第一个元素
        list.remove(0);
//(9)输出第一个元素
        System.out.println("输出第一个元素:"+list.getFirst());
//(10)第3次输出所有元素的值
        System.out.println("第3次输出所有元素的值:" + list);
    }
}
