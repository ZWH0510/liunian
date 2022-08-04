package work.D010902;

public class T06 {
    public static void main(String[] args) {

        try {
            divide(18,-3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divide(int a, int b) throws Exception {

        if (b < 0) {
            System.out.println("除数为负数");
        } else {
            int result = a / b;
            System.out.println(result);
        }
    }
}
//实验6(throw)

//一.创建测试类
//1 声明divide()方法实现了两个整数相除，带有两个int参数（在步骤"2)"完成后增加：通过throws要声明抛出自定义异常）
//1）判断第二个参数是否小于0
//2）如果小与0，则用throw声明有自定义异常，提示“除数为负数”（编译报错）
//3）定义一个变量result记录两个数相除的结果
//4）返回结果


//2 声明main()方法
//1）在方法中调用divide()方法，传入两个参数，其中第二个参数为负数，并将结果赋给一个变量
// （编译报错，可以通过try...catch捕获处理或者使用throws在main方法出继续声明抛出异常，同实验4throws用法）
//2）打印输出该变量的值
