package work.D010904;

//实验1 Math常用方法
//一.测试类T01
import java.util.Random;
public class T01 {
    public static void main(String[] args) {
        //1.定义main方法
        //(1)打印"计算-1绝对值的结果: "
        System.out.println("abs(-1)=" + Math.abs(-1));
        //(2)打印"求大于5.6的最小整数: "
        System.out.println("ceil(5.6)=" + Math.ceil(5.6));
        //(3)打印"求小于-3.2的最大整数: "
        System.out.println("floor(-3.2)=" + Math.floor(-3.2));
        //(4)打印"对-4.6进行四舍五入后的结果: "
        System.out.println("round(-4.6)=" + Math.round(-4.6));
        //(5)打印"求2.1和-2.1两个数的较大值: "
        System.out.println("max(2.1,-2.1)=" + Math.max(2.1, -2.1));
        //(6)打印"求2.1和-2.1两个数的较小值: "
        System.out.println("min(2.1,-2.1)=" + Math.min(2.1, -2.1));
        //(7)打印"生成一个大于等于0.0小于1.0随机值: "
        Random r1 = new Random();
        System.out.println("生成一个大于等于0.0小于1.0随机值为:" + r1.nextFloat());
    }
}
