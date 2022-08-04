package work.D010908;
/*

异常实验1——try...catch...finally语句

要求如下：
新建项目命名为“班级+学号+姓名+ch0601”，例如：“计算机200101张三ch0601”，所有的题目均保存在同一项目里。包名为“hati.姓名缩写”
编写Java应用程序，实现以下功能：
// 1、创建一个主类——测试类“Test01.java”
//   1）声明divide()方法实现了两个整数相除，带有两个int参数
//  （1）定义一个变量result记录两个数相除的结果
//  （2）返回结果


//   2）声明main()方法
//  （1）在方法中调用divide()方法，传入两个参数，其中第二个参数为0，并将结果赋给一个变量
//  （2）打印输出该变量的值。
//  （3）用try语句将前两步括起来
//  （4）加catch语句
//  （5）对可能产生的异常处理，打印捕获到的异常信息
//  （6）异常产生后，加return语句返回
//  （7）加finally语句，打印“程序进入finally代码块”，不管异常是否发生，打印程序接着继续向下执行
 */
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
            System.out.println("程序正常运行");
        }
    }
}
