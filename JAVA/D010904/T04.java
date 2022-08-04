package work.D010904;
import java.util.Random;
//实验4 浮点类型的随机数
//一.测试类T04
public class T04 {
    //1.定义main方法
    public static void main(String[] args) {
        //(1)创建Random实例对象
        Random r1 = new Random();
        //(2)打印"产生float类型随机数: "
        System.out.println("产生float类型随机数: " + r1.nextFloat());
        //(3)"产生0~100之间int类型的随机数:"
        System.out.println("产生0~100之间int类型的随机数:" + r1.nextInt(100));
        //(4)"产生double类型的随机数:"
        System.out.println("产生double类型的随机数:" + r1.nextDouble());
    }
}
