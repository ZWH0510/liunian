package work.D010908;
/*
新建项目命名为“班级+学号+姓名”，例如：“计算机200101张三2”，所有的题目均保存在同一项目里。报名“hati.姓名缩写”
编写Java应用程序，创建测试主类“Test01.java”，实现以下功能：
    将源代码界面和编译运行结果截图上传。(10分)
 */

public class T02 {
    public static void main(String[] args) {
//        （3）在主类的main()方法中创建一个Student对象，使用无参构造方法实例化该对象，
//        调用setXxx()方法（注意对静态方法的调用）对属性赋值，属性的值，
//        均为你的信息，并在控制台上调用info()方法输出学生的基本信息。
        Student s = new Student("赵文豪", "202104240109", 19);
        s.setName();
        s.setId();
        s.setAge();
        s.setMajor();
    }
}

//（1）创建人类People.java，完成如此下内容:
//        所具有的属性包括：String类型的姓名（name）、String类型的身份证号（id）、int类型的年龄（age）。
//        创建无参和全参的构造方法。
//        创建setXxx()和 getXxx()方法设置和获取属性值。
//        编写一个无返回值、无参数的info()方法，输出People的相关信息。
class People {
    private String name = "赵文豪";
    private String id = "202104240109";
    private int age = 19;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People() {

    }

    public People(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String info() {
        return "People{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}

//（2）创建学生类Student.java继承自People类
//        还具有的属性包括： String类型major专业，将专业定义为静态变量。
//        创建无参和全参的构造方法。
//        创建setXxx()和 getXxx()方法设置和获取属性值，其中对major属性的访问是静态方法。
//        重写info()方法，输出Sudent的相关信息。
class Student extends People {
    private static String major = "大数据";

    public Student(String name, String id, int age) {
        super("赵文豪", "202104240109", 19);
    }

    public String setMajor() {
        System.out.println("专业：大数据");
        return major;
    }

    public static void setMajor(String major) {
        Student.major = major;
    }

    public void setName() {
        System.out.println("姓名：赵文豪");
    }

    public void setId() {
        System.out.println("学号：202104240109");
    }

    public void setAge() {
        System.out.println("年龄：" + 19);
    }
}