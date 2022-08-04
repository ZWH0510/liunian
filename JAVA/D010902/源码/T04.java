package work.D010902;

public class T04 {
    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
        }
    }

    public static void divide() throws Exception {
        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println(result);
    }
}

//实验4(throws)
// 一.创建测试类
//1 声明divide()方法实现了两个整数相除，带有两个int参数，并使用throws声明抛出异常（调用者有两种方法处理此声明的异常）
//1）定义一个变量result记录两个数相除的结果
//2）返回结果


//2 声明main()方法
//1）在方法中调用divide()方法，传入两个参数，其中第二个参数为0，并将结果赋给一个变量
//2）打印输出该变量的值
//3）方法一：使用try...catch对前两步可能出现的异常进行捕获（同实验3）
//4）不管异常是否发生，打印程序接着继续向下执行


//或3）方法二：通过main()方法继续抛出异常，不需要try...catch捕获处理异常，
//删除try...catch代码块，注意保留try中的代码
//注意：方法一和方法二都可以解决步骤"1)"编译时报错，但方法二程序虽然可以通过编译，但从运行结果可以看出，在运行时期由于没有对"divide方法中除以0"的异常进行处理，最终导致程序终止运行，没有正常结束。