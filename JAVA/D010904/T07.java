package work.D010904;
//实验7 在屏幕上打印*矩形——parseInt()方法的使用
//一.测试类T05
//1.定义main方法
public class T07 {
    public static void main(String[] args) {
        //(1)将字符串"20"转换成int类型并赋值给一个int类型的变量，作为矩形的宽
        String str1 = "20";
        int k = Integer.parseInt(str1);
        //(2)将字符串"10"转换成int类型并赋值给一个int类型的变量，作为矩形的高
        String str2 = "10";
        int g = Integer.parseInt(str2);
        //(3)利用外层循环打印10次StringBuffer类的对象
        //(4)利用内层循环为StringBuffer类的对象完成20次的追加"*"
        for (int i = 0; i < g; i++) {
            StringBuffer s = new StringBuffer();
            for (int j = 0; j < k; j++) {
                s.append("*");
            }
            System.out.println(s.toString());
        }
    }
}






