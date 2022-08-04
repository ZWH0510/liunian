package work.D010910;
//HashSet实验2——HashSet集合存放Student类

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class My08 {
    public static void main(String[] args) {
//        2、定义测试主类My02，并选中main方法，在main方法中实现如下功能：
//        1)创建一个HashSet集合。需要导入java.util包
        Set set1 = new HashSet();
//        2)创建六个Student对象。以自己和自己前后各两个人的信息进行实例化这些对象，第六个对象同第一个对象
        Student student1 = new Student("001", "皮卡丘", 18, 66.6, "道吉森林");
        Student student2 = new Student("002", "拉布拉多", 14, 69.2, "狗窝");
        Student student3 = new Student("003", "慢羊羊", 15, 64.3, "羊村");
        Student student4 = new Student("004", "灰太狼", 32, 86.2, "狼堡");
        Student student5 = new Student("005", "红太狼", 25, 99.3, "狼堡");
        Student student6 = new Student("006", "皮卡丘", 18, 66.6, "道吉森林");
//        3)将六个对象添加到集合中
        set1.add(student1);
        set1.add(student2);
        set1.add(student3);
        set1.add(student4);
        set1.add(student5);
        set1.add(student6);
//        4)输出集合的元素个数
        System.out.println("输出集合的元素个数:" + set1.size());
//        5)用2种方式遍历该集合中的元素
        System.out.println("使用for...each语句遍历集合:");
        for (Object name : set1) {
            System.out.println(name + "\t");
        }
    }
}

//        1、定义Student实体类
class Student1 {
    //        1)声明字段：String类型的学号id
//        2)声明字段：String类型的姓名name
//        3)声明字段：int类型的年龄age
//        4)声明字段：double类型的体重weight
//        5)声明字段：String类型的地址address
    String id;
    String name;
    int age;
    double weight;
    String address;
//        6)构建全参构造方法

    public Student1(String id, String name, int age, double weight, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
    }
//        7)重写toString()方法，输出学号、姓名、年龄、体重、地址等字符串信息

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", address='" + address + '\'' +
                '}';
    }
//1、直接复制2中的Student类
    //1) 重写hashCode()方法
    //2) 重写equals()方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age &&
                Double.compare(student1.weight, weight) == 0 &&
                id.equals(student1.id) &&
                name.equals(student1.name) &&
                address.equals(student1.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, weight, address);
    }
}

