package work.D010902;

public class T01 {
    public static void main(String[] args) {
        divide();
    }

    public static void divide() {
        int a = 10;
        int b = 0;
        int result = 0;
        try {
            result = a / b;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
//实验1(异常的产生)
//一.测试类T01
//1 定义带有两个int类型参数的静态divide方法,
//1) 定义一个变量result记录两个数相除的结果
//2) 返回结果

//2 定义main方法
//1) 调用divide方法，传入两个参数，其中第二个参数为0，并将结果赋值给一个变量
//2) 打印该变量

