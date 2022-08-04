package work.D010910;
//HashSet实验1——HashSet集合的简单使用

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class My06 {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1.add("喜羊羊");
        set1.add("美羊羊");
        set1.add("懒羊羊");
        set1.add("沸羊羊");
        set1.add("奥特曼");
        System.out.println("使用Iterator对象:");
        Iterator i = set1.iterator();
        while (i.hasNext()) {
            String name = (String)i.next();
            System.out.println(name+"\t");
        }
        System.out.println("使用for...each语句遍历集合:");
        for (Object name:set1){
            System.out.println(name+"\t");
        }
    }
}

//1、定义测试主类My01，并选中main方法，在main方法中实现如下功能：
//1)     创建一个HashSet集合对象，使用空参构造方法实例化该对象，需要导入java.util包
//2)     为该集合中添加班级里，你自己及你的学号前后的4个学生的姓名
//3)     再向集合中添加自己的姓名
//4)     使用迭代器对象和for...each遍历集合中的元素
//2、将代码和运行结果截图上传
