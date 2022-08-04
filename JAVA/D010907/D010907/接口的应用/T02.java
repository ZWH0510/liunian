package work.D010907.接口的应用;

public class T02 {
    public static void main(String args[]) {
        Dog dog = new Dog();
        System.out.println(dog.ANIMAL_BEHAVIOR);
        System.out.println(Animal.ANIMAL_BEHAVIOR);
        dog.breathe();
        dog.run();
        dog.liveOnLand();
    }
}

interface Animal1 {
    public static final String ANIMAL_BEHAVIOR = "动物的行为";
    public abstract void breathe();
    void run();
}
interface LandAnimal1 extends Animal {
    void liveOnLand();
}

 class Dog1 implements LandAnimal1 {
    public void breathe() {
        System.out.println(ANIMAL_BEHAVIOR + ":" + "狗在呼吸");
    }
    public void run() {
        System.out.println(ANIMAL_BEHAVIOR + ":" + "狗在奔跑");
    }
    public void liveOnLand() {
        System.out.println("狗是陆地上的动物。。。");
    }
}
/*
接口实验2——接口的继承
要求如下：
新建项目命名为“班级+学号+姓名+ch0802”，例如：“计算机200101张三ch0802”，所有的题目均保存在同一项目里。包名为“hati.姓名缩写.t02”
编写Java应用程序，实现以下功能：
一、声明Animal接口，然后做如下工作：
1）定义全局常量，ANIMAL_BEHAVIOR = "动物的行为";
2）定义抽象方法breathe()，其默认修饰为public abstract
3）定义抽象方法run()；

二、声明LandAnimal接口继承自Animal，在LandAnimal接口中声明liveOnLand()方法；

三、声明Dog类实现了LandAnimal接口，然后做如下工作：
1）实现breathe()方法；
2）实现run()方法；
3）实现liveOnLand()方法；

四、定义主类测试类Ch0803，选中main()主方法,，然后在main()方法做如下工作：
1）main方法中，创建Dog类的实例对象；
2）使用对象名.常量名的方式输出接口中的常量；
3）使用接口名.常量名的方式输出接口中的常量；
4）调用Dog类的breathe()方法；
5）调用Dog类的run()方法；
6）调用Dog类的liveOnLand。
 */
