package work.D010907.接口的应用;


public class T01 {
    public static void main(String args[]) {
        Dog dog = new Dog();
        System.out.println(dog.ANIMAL_BEHAVIOR);
        System.out.println(Animal.ANIMAL_BEHAVIOR);
        dog.breathe();
        dog.run();
    }
}

interface Animal {
    public static final String ANIMAL_BEHAVIOR = "动物的行为";
    public abstract void breathe();
    void run();
}

class Dog implements Animal {
    public void breathe() {
        System.out.println(ANIMAL_BEHAVIOR + ":" + "狗在呼吸");
    }
    public void run() {
        System.out.println(ANIMAL_BEHAVIOR + ":" + "狗在奔跑");
    }
    public void liveOnLand() {
    }
}


/*
接口实验1——接口定义及接口的实现
要求如下：
新建项目命名为“班级+学号+姓名+ch0802”，例如：“计算机200101张三ch0802”，所有的题目均保存在同一项目里。包名为“hati.姓名缩写.t01”
编写Java应用程序，实现以下功能：

一、声明Animal接口
1）定义全局常量，其默认修饰符为public static final
String ANIMAL_BEHAVIOR = "动物的行为";
2）定义抽象方法breathe()，其默认修饰为public abstract
3）定义抽象方法run()。

二、声明一个Dog类实现Animal接口
2）实现breathe()方法，“狗在呼吸”
3）实现run()方法，“狗在奔跑”

三、定义测试主类Ch0802
1）在主方法main中创建Dog类的实例对象并实例化；
2）使用对象名.常量名的方式输出接口中的常量；
3）使用接口名.常量名的方式输出接口中的常量；
4）调用Dog类的breathe()方法；
5）调用Dog类的run()方法。
 */
