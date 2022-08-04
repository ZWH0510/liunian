package work.D010912;
//    可变长参数实验
public class T05 {
    public static void main(String[] args) {
        // 调用可变长参数方法
        String one = stringConcat("Hello");
        String two = stringConcat("Hello", " Java");
        String three = stringConcat("Hello", " Java", "!");
        System.out.println("一个参数：" + one);
        System.out.println("两个参数：" + two);
        System.out.println("三个参数：" + three);
        System.out.println();
        System.out.println("一个参数取最大值：" + max(10));
        System.out.println("三个参数取最大值：" + max(10, 2, 34));
        System.out.println("六个参数取最大值：" + max(10, 2, 34, 1234, 89, 67));
    }

    // 声明可变长参数，方法体是对String参数进行连接操作
    public static String stringConcat(String... objs) {
        String sum = "";
        for (String s : objs) {
            sum += s;    //字符串连接
        }
        return sum;
    }

    // 声明可变长参数，方法体是对多个double参数取最大值
    public static double max(double... args) {
        double largest = Double.MIN_VALUE;
        for (double x : args) {
            if (x > largest) largest = x;//取参数中的最大值
        }
        return largest;
    }
}
