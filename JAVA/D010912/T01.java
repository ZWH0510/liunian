package work.D010912;

import java.util.ArrayList;
import java.util.Iterator;

public class T01 {
    public static void main(String[] args) {
//2.在main()中该声明一个存放String对象的名为names的ArrayList集合，并用ArrayList空参构造方法实例化
        ArrayList names = new ArrayList();
//(1)按顺序向集合中添加5个字符串对象：5个你喜欢的明星的名字。
        names.add("佐菲");
        names.add("奥特曼");
        names.add("赛文");
        names.add("杰克");
        names.add("艾斯");
//(2)对集合中的元素进行遍历（用三种遍历方式：1、for循环语句遍历。2、Iterator对象结合while循环遍历。3、for...each语句遍历），输出集合中每个元素的位置和内容。
        System.out.println("使用for循环语句遍历:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + "\t");
        }
        System.out.println();
        System.out.println("使用Iterator对象:");
        Iterator i = names.iterator();
        while (i.hasNext()) {
            String name = (String) i.next();
            System.out.println(name + "\t");
        }
        System.out.println();
        System.out.println("使用for...each语句遍历集合:");
        for (Object name : names) {
            System.out.println(name + "\t");
        }
//(3)删除集合中的第三个元素，并显示被删除元素的值。
        names.remove(2);
//(4)删除成功后，再次显示当前集合的第三个元素的内容，并输出集合元素的个数。
        System.out.println("当前集合的第三个元素的内容:"+names.get(2));
        System.out.println("集合元素的个数为:"+names.size());
    }
}