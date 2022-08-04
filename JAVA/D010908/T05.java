package work.D010908;

/*
四、定义测试主类Ch0805，选定main主方法，在main方法中实现如下功能：
分别生成不同的运算操作对象，传入对应的值，然后进行相应的运算

3、将代码和运行结果截图上传
 */
//工厂类实验
//要求如下：
//新建项目命名为“班级+学号+姓名+ch0805”，例如：“计算机200101张三ch0805”，所有的题目均保存在同一项目里。包名为“hati.姓名缩写.t02”
//编写Java应用程序，实现以下功能：


//一、定义抽象产品角色（抽象类或者接口）
//1、定义一个使用abstract修饰的Operation运算类，在该类中定义两个操作数私有的、double类型的num1和num2，
//   并构建公共的getter和setter方法，然后定义一个公共的抽象方法getResult()
public class T05 {
    public static void main(String[] args) {
        Add a = new Add();
        a.getResult();
        Sub s = new Sub();
        s.getResult();
        Mul m = new Mul();
        m.getResult();
        Div d = new Div();
        d.getResult();
    }
}

    abstract class Operation {
        private double num1 = 1314;
        private double num2 = 520;

        public double getNum1() {
            return num1;
        }

        public void setNum1(double num1) {
            this.num1 = num1;
        }

        public double getNum2() {
            return num2;
        }

        public void setNum2(double num2) {
            this.num2 = num2;
        }

        public void getResult() {
            System.out.println(num1 - num2);
        }
    }

    //二、定义具体的产品（类）
//1、定义一个加法类Add继承自Operation运算类，并重写其抽象方法getResult()，计算两个数的和，并返回
//2、定义一个减法类Sub继承自Operation运算类，并重写其抽象方法getResult()，计算两个数的差，并返回
//3、定义一个乘法类Mul继承自Operation运算类，并重写其抽象方法getResult()，计算两个数的乘积，并返回
//4、定义一个除法类Div继承自Operation运算类，并重写其抽象方法getResult()，计算两个数的除法操作，注意需要判断除数是否为0，所以需要抛出异常
    class Add extends Operation {
        public void getResult() {
            System.out.print("计算两个数的和得：");
            System.out.println(getNum1()+getNum2());
        }
    }

class Sub extends Operation {
    public void getResult() {
        System.out.print("计算两个数的差得：");
        System.out.println(getNum1()-getNum2());
    }
}

class Mul extends Operation {
    public void getResult() {
        System.out.print("计算两个数的乘积得：");
        System.out.println(getNum1()*getNum2());
    }
}

class Div extends Operation {
    public void getResult() {
        System.out.print("计算两个数的除法操作得：");
        try {
            System.out.println(getNum1()/getNum2());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}


//三、定义工厂角色（类）
//定义一个运算工厂类OperationFactory，在该类中做如下工作
//1）声明一个公共的、静态的、Operation对象并实例化为null
//2）定义一个公共的、静态的、返回Operation对象的方法getOperation()
//      public static Operation getOperation(String operator)
//    在该方法中根据传入的运算符进行相对应的运算对象实例化，最后返回该对象
class OperationFactory{
    private static Object Operation;
    public static void Operation(){
        Operation = null;
    }
    public static void getOperation(String operator){
        System.out.println(Operation);
    }
}

