package work.D010904;
//实验6 拆箱操作
//一.测试类T06
public class T06 {
    //1.定义main方法
    public static void main(String[] args) {
        //(1)定义Integer类型实例对象，传入参数20
        Integer i1 = Integer.valueOf(20);
        //(2)定义int类型的变量并赋值
        int i2 = 10;
        //(3)定义int类型的变量，接收Integer实例对象转成int类型后的值与步骤(2)中的变量相加的结果
        Integer intValue = i1.intValue();
        //(4)打印步骤(3)的变量
        System.out.println(intValue+i2);
    }
}
