package work.D010904;
//实验3 有参构造方法产生随机数
import java.util.Random;
//一.测试类T03
public class T03 {
    //1.定义main方法
    public static void main(String[] args) {
        //(1)创建Random实例对象，传入种子13
        Random r1 = new Random(13);
        //(2)随机产生10个[0,100)之间的整数并打印
        for (int i = 0; i < 10; i++) {
            System.out.print(r1.nextInt(100) + "\t");
        }
        //(3)多次运行程序观察结果
    }
}
