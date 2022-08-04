package work.D010908;

import java.util.Scanner;

/*
新建项目命名为“班级+学号+姓名”，例如：“计算机200101张三1”，所有的题目均保存在同一项目里。报名“hati.姓名缩写”

1 编写Java应用程序，创建主类“Test01.java”，实现以下功能：
（4）将源代码界面和编译运行结果截图上传。(10分)
 */
public class T01 {
    public static void main(String[] args) {

//        （1）找出88-888之间能被7整除且个位是2的数，并输出符合条件的数的个数。

        int count = 0;
        System.out.println("符合的有：");
        for (int i = 88; i <= 888; i++) {
            if (i % 7 == 0 && i % 10 == 2) {
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println();
     System.out.println("符合条件的数的个数:" + count);


//        （2）定义整型数组，长度为5，初始化数组内容后，找出该数组元素的最大值、最小值，并求和，然后将最大值、最小值和数组元素的和输出到控制台上。
       int i, min, max;
            int arr[] = {666, 654, 854, 968, 362};
            min = max = arr[4];
            for (i = 0; i<arr.length;i++) {
                if (arr[i] > max)
                    max = arr[i];
                if (arr[i] < max)
                    min = arr[i];
            }
            int h =max+min;
            System.out.println("\n数组最大值、最小值，求和是："+h);
            System.out.println("数组的最大值是：" + max);
            System.out.println("数组的最小值是：" + min);


//        （3）在控制台输入年份和月份，请输出该年该月的天数。
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = s.nextInt();
        System.out.println("请输入月份:");
        int month = s.nextInt();
        int day = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
        }
        System.out.println(year + "年" + month + "月有" + day + "天");
    }
}