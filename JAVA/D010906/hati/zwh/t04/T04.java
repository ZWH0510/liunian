package work.D010906.hati.zwh.t04;
public class T04 {
    public static void main(String[] args) {
        Dog D = new Dog();
        D.shout();
    }
}
abstract class Animal {
    abstract void shout();
}
class Dog extends Animal {
    public void shout() {
        System.out.println("汪汪...");
    }
}
/*
ch0801 抽象类和抽象方法实验
要求如下：
新建项目命名为“班级+学号+姓名+ch0801”，例如：“计算机200101张三ch0801”，所有的题目均保存在同一项目里。包名为“hati.姓名缩写”

编写Java应用程序，实现以下功能：
1）声明一个Animal类，该类使用abstract；
2）在该类中声明一个shout()方法，使用abstract修饰；
3）声明一个Dog类继承自Animal类，重写(实现)父类的shout()方法；
4）声明主类测试类主类Ch0801，在main方法中创建Dog对象并实例化，调用shout()方法。
 */