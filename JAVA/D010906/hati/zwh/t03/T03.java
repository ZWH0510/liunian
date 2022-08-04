package work.D010906.hati.zwh.t03;

public class T03 {
    public static void main(String[] args) {
        Animal.animalShout();
        Animal an = new Animal() {
            @Override
            public void shout() {
            }
        };
    }
}

interface Animal {
    static void animalShout() {
        System.out.println("喵喵...");
    }

    abstract void shout();
    static void animalShout(Animal an) {
        an.shout();
        abstract class Cat implements Animal {
            public void shout() {
            }
        }
    }
}

/*

内部类实验3——内部类

要求如下：
新建项目命名为“班级+学号+姓名+ch0803”，例如：“计算机200101张三ch0803”，所有的题目均保存在同一项目里。包名为“hati.姓名缩写.t03”
编写Java应用程序，实现以下功能：
1、定义Animal接口，在该接口中定义抽象方法shout()

2、定义测试主类Ch0806，选定main主方法
1）在测试类中定义静态方法animalShout()，参数为Animal对象an，然后在方法体中调用传入对象an的shout()方法
2）在测试类中定义一个内部类Cat实现Animal接口，并实现shout()方法，打印"内部类——喵喵…"
3）在main方法中声明一个Cat对象，调用animalShout()方法并传入Cat对象

3、将代码和运行结果截图上传
 */