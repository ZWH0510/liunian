package work.D010901;

import java.util.Scanner;

public class T07 {
    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入除数：");
        int num2 = sc.nextInt();
        if (num2>50){
            throw new ArithmeticException("除数不能>50");
        }
        System.out.println(num1+"/"+num2+"="+num1/num2);
    }
}