package work.D010912;
//实验2 HashSet集合存放Student对象，并重写hashCode()和equals()方法
import java.util.HashSet;
import java.util.Objects;

public class T02 {
    public static void main(String[] args) {
//（1）创建HashSet集合hs
        HashSet hs = new HashSet();
//（2）创建三个Student对象，并初始化对象
        Student stu1 = new Student("1", "维克特利");
        Student stu2 = new Student("2", "艾克斯");
        Student stu3 = new Student("3", "欧布");
//（3）向集合hs中添加该三个对象
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
//（4）输出集合hs中元素。
        System.out.println(hs);
    }
}

//2.定义Student实体类
//1)声明字段:String类型的学号id
//2)声明字段:String类型的姓名name
class Student {
    String id;
    String name;

    //(3)构建全参构造方法
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //(4)重写toString()方法,输出年龄、学号、姓名等字符串信息
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    //(5)重写hashCode()方法:返回id属性的哈希值
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    //(6)重写equals()方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id) &&
                name.equals(student.name);
    }
}



