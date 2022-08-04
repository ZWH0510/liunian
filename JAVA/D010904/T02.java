package work.D010904;
import java.util.Random;
//实验2 无参构造方法产生随机数
//一.测试类T02
public class T02 {
    //1.定义main方法
    public static void main(String[] args) {
        //(1)创建Random实例对象
        Random r1 = new Random();
        //(2)随机产生10个[0,100)之间的整数并打印
        for (int i = 0; i < 10; i++) {
            System.out.print(r1.nextInt(100)+"\t");
        }
        //(3)多次运行程序观察结果
    }
}
