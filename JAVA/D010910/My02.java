package work.D010910;
//实验2 Student对象存入HashSet集合

//(1)创建一个HashSet集合,需要导入java.util包

import java.util.HashSet;
import java.util.Set;

//1.包:ss;类:My02
public class My02 {
    //3.定义main方法
    public static void main(String[] args) {
        Set set2 = new HashSet();
        //(2)创建三个Student对象,其中一个对象以班级中任意同学信息进行实例化,另外两个对象均以自己的信息进行实例化
        Student2 student1 = new Student2("001", "皮卡丘");
        Student2 student2 = new Student2("002", "蜡笔小新");
        Student2 student3 = new Student2("002", "蜡笔小新");
        //(3)将三个对象添加到集合中

        set2.add(student1);
        set2.add(student2);
        set2.add(student3);
        //(4)打印该集合
        System.out.println(set2);
    }
}

//2.定义Student实体类
class Student2 {
    //(1)声明字段:String类型的学号id
    //(2)声明字段:String类型的姓名name
    String id;
    String name;

    //(3)构建全参构造方法
    public Student2(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //(4)重写toString()方法,输出学号、姓名等字符串信息
    @Override
    public String toString() {
        return "Student2{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
