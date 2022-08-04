package work.D010901;

import java.util.Scanner;
public class T03 {
    public static void main(String[] args) {
        try{
            divide();
        }catch(Exception e) {
            System.out.println("出现异常，除数不能为0");
            e.printStackTrace();
        }
    }
    public static void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被整数:");
        int num1 = sc.nextInt();
        System.out.println("请输入除数:");
        int num2 = sc.nextInt();
        System.out.println(num1+"/"+num2+"="+num1/num2);
        System.out.println("程序结束！");
    }
}