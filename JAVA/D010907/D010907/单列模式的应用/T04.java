package work.D010907.单列模式的应用;
/*
编写程序，求柱体的体积，要求如下：
1.为柱体的底面设计一个接口Geometry，包含计算面积的方法calArea();
2.为柱体设计类column，要求有两个成员变量，底面和高度。
  底面是任何可以计算面积的几何形状。其次，实现构造方法，对成员变量赋值。
  最后，包含成员方法，计算柱体column的体积。
3.编写测试类圆形类、矩形类实现Geometry接口，编写测试类Test，分别用圆形、矩形作为柱体的底面，并计算其体积。
 */

import java.util.Scanner;//引入Scanner类
public class T04{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请分别输入圆柱体的半径、高：");
        double type1=scanner.nextDouble();
        double type2=scanner.nextDouble();
        CylinderImpl cy=new CylinderImpl(type1,type2);
        System.out.print("柱体的体积为：");
        cy.volume();
    }
}

interface Geometry{
    Double PI=3.14;
}

interface column extends Geometry{
}
class CylinderImpl implements column{
    private Double radius;
    private Double height;
    public CylinderImpl(Double radius,Double height){
        this.radius=radius;
        this.height=height;
    }

    public void volume(){
        System.out.println(PI*radius*radius*height);
    }
}
