package work.D010910;
//1、实验1 HashSet集合的使用

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//一.测试类My01
//1.包:ss;类: My01
public class My01 {
    //2.定义main方法
    public static void main(String[] args) {
        //(1)创建一个HashSet集合,需要导入java.util包
        Set set1 = new HashSet();
        //(2)为该集合中添加班级里，你的学号前后的2个学生的姓名
        set1.add("奥特曼");
        set1.add("铠甲勇士");
        //(3)向集合中添加自己的姓名两次
        set1.add("蜡笔小新");
        set1.add("蜡笔小新");
        //(4)使用Iterator遍历集合中的元素
        System.out.println("使用Iterator遍历集合中的元素:");
        Iterator i = set1.iterator();
        while (i.hasNext()) {
            String str1 = (String) i.next();
            System.out.println(str1);
        }
    }
}


