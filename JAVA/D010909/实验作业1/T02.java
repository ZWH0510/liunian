package work.D010909.实验作业1;
import java.util.ArrayList;
public class T02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Student s1 = new Student("06", "于董杰", 18, "大数据");
        Student s2 = new Student("07", "宋梦雨", 18, "大数据");
        Student s3 = new Student("08", "张佳欣", 18, "大数据");
        Student s4 = new Student("10", "杜新宇", 18, "大数据");
        Student s5 = new Student("11", "朱文涛", 18, "大数据");
        Student s6 = new Student("12", "贾少鸣", 18, "大数据");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

class Student {
    String id;
    String name;
    int age;
    String className;

    public Student(String id, String name, int age, String className) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int setAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String className() {
        return className;
    }

    public void setClassName() {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", className=" + className + "]";
    }
}

