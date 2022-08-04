package work.D010910;
//实验3 重写hashCode()和equals()方法
//1.包:ss;类:My03

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class My03 {
    //3.定义main方法
    public static void main(String[] args) {
//(1)创建一个HashSet集合,需要导入java.util包
        Set set3 = new HashSet();
//(2)创建三个Student对象,其中一个对象以班级中任意同学信息进行实例化,另外两个对象均以自己的信息进行实例化
        Student3 student1 = new Student3("001", "海绵宝宝");
        Student3 student2 = new Student3("002", "派大星");
        Student3 student3 = new Student3("003", "派大星");
//(3)将三个对象添加到集合中
        set3.add(student1);
        set3.add(student2);
        set3.add(student3);
//(4)打印该集合
        System.out.println(set3);
    }
}

//2.定义Student实体类
class Student3 {
    //(1)声明字段:String类型的学号id
    //(2)声明字段:String类型的姓名name
    String id;
    String name;

    //(3)构建全参构造方法
    public Student3(String id, String name) {
        this.id = id;
        this.name = name;
    }
//(4)重写toString()方法,输出学号、姓名等字符串信息

    @Override
    public String toString() {
        return "Student3{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    //(5)重写hashCode()方法:返回id属性的哈希值
    //(6)重写equals()方法

    @Override
    public boolean equals(Object o) {
        //①判断要进行比较的对象是否为同一个对象,如果是,返回true
        if (this == o) return true;
        //②判断要进行比较的对象是否为Student类型,如果不是,返回false
        if (o == null || getClass() != o.getClass()) return false;
        //③将要进行比较的对象进行强制类型转换为Student,判断两个对象的id是否相等,并将判断结果返回
        Student3 student3 = (Student3) o;
        return id.equals(student3.id) &&
                name.equals(student3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


