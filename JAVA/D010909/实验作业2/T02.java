package work.D010909.实验作业2;
//ArrayList集合：
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//1.包:ss;类:My2
public class T02 {
    public static void main(String[] args) {
//2.在main()中该声明一个List对象list，并用ArrayList空参构造方法实例化
        List list = new ArrayList();
//(1)调用size()方法输出该集合中元素的个数
        System.out.println("输出该集合中元素的个数:" + list.size());
//(2)向该集合中添加3个明星的姓名
        list.add("周杰伦");
        list.add("铠甲勇士");
        list.add("奥特曼");
//(3)第2次调用size()方法输出该集合中元素的个数
        System.out.println("第2次调用size()方法输出该集合中元素的个数:" + list.size());
//(4)输出list集合中的元素
        System.out.println("输出list集合中的元素:" + list);
//(5)向该集合中索引为2的位置添加一个明星“杨过”
        list.add(2, "杨过");
//(6)第2次输出list集合中的元素
        System.out.println("第2次输出list集合中的元素:" + list);
//(7)删除索引为1位置上的元素
        list.remove(1);
//(8)第3次输出list集合中的元素
        System.out.println("第3次输出list集合中的元素:" + list);
//(9)删除明星“杨过”
        list.remove("杨过");
//(10)第4次输出list集合中的元素
        System.out.println("第4次输出list集合中的元素:" + list);
//(11)判断list集合中是否包含明星“谢霆锋”，并输出判断结果
        System.out.println("判断list集合中是否包含明星“谢霆锋”:" + list.contains("谢霆锋"));
//(12)用for循环遍历集合list，输出集合中所有元素在一行并用逗号隔开。
        System.out.println("用for循环遍历集合list，输出集合中所有元素在一行并用逗号隔开:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
//(13)换行
        System.out.println();
//(14)用迭代器遍历集合list，输出集合中所有元素在一行并用逗号隔开。
        System.out.println("用迭代器遍历集合list，输出集合中所有元素在一行并用逗号隔开:");
        Iterator i = list.iterator();
        while (i.hasNext()) {
            String str1 = (String) i.next();
            System.out.print(str1 + ",");
        }
//(15)换行
        System.out.println();
//(16)用for....each循环遍历集合list，输出集合中所有元素在一行并用逗号隔开。
        System.out.println("用for....each循环遍历集合list，输出集合中所有元素在一行并用逗号隔开:");
        for (Object number : list) {
            System.out.print(number + ",");
        }
//(17)换行
        System.out.println();
//(18)清空list
        list.clear();
//(19)判断list集合是否为空，并输出判断结果
        System.out.println("判断list集合是否为空:" + list.isEmpty());
    }
}
