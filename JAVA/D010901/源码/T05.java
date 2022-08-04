package work.D010901;

import java.util.Scanner;
public class T05 {
    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            System.out.println("出现除数为0的异常");
            System.out.println(e.getMessage());
            return;
        } finally {
            System.out.println("finally代码块");
            System.out.println("程序结束");
        }
    }
    public static void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入除数：");
        int num2 = sc.nextInt();
        System.out.println(num1+"/"+num2+"="+num1/num2);
        System.out.println("程序结束！");
    }
}