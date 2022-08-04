package work.D010904;
//实验5 装箱操作
//一.测试类T05
public class T05 {
    //1.定义main方法
    public static void main(String[] args) {
        //(1)定义int类型变量，并赋值
        int a = 10;
        //(2)定义Integer类的实例对象，将上一步创建的变量作为参数传入
        Integer i = new Integer(10);
        //(3)打印该实例对象
        System.out.println(i);
    }
}
