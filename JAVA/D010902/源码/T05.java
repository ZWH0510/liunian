package work.D010902;

public class T05 {
    public static void main(String[] args) {

    }
}
    class Exception1 {
        public Exception1() {
            int a = 0;
            int b = 0;
            System.out.println("Exception的构造函数" + a + " " + b);
        }

        static class DivideByMinusException extends Exception1 {
            public DivideByMinusException(int a, int b) {
                super();
                System.out.println("DivideByMinusException的构造函数" + a + " " + b);
            }
        }
    }
//一.创建一个自定义异常类
//1 定义一个异常类DivideByMinusException继承自Exception
//1）声明一个无参的构造方法，在方法内调用父类的无参构造方法
//2）声明一个String类有参的构造方法，在方法内调用父类的有参构造方法