package work.D010902;

public class T03 {
    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divide() {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
        //实验3(try-catch-finally)



// 一.创建测试类
//1 声明divide()方法实现了两个整数相除，带有两个int参数
//1）定义一个变量result记录两个数相除的结果
//2）返回结果



//2 声明main()方法
//1）在方法中调用divide()方法，传入两个参数，其中第二个参数为0，并将结果赋给一个变量
//2）打印输出该变量的值
//3）用try语句将前两步括起来
//4）加catch语句
//5）对可能产生的异常进行处理，打印捕获到的异常信息
//6）处理异常后，加return语句返回
//7）加finally语句，打印“程序进入finally代码块”
//8）不管异常是否发生，打印程序接着继续向下执行


