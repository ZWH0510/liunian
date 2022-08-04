package work.D010911;
//Map实验4—HashMap集合第3种遍历方式
import java.util.*;
public class My_04 {
    public static void main(String[] args) {
//1)创建一个HashMap集合，使用空参的HashMap集合来实例化对象，需要导入java.util包
        Map map4 = new HashMap();
//2)通过put()方法向集合中加入三个元素：班级中任意3个学生的学号(key)和姓名(value)
        map4.put(01, "玛卡·巴卡");
        map4.put(02, "唔西·迪西");
        map4.put(03, "依古·比古");
//3)获取集合中所有的值，存入Collection集合中
        Collection values = map4.values();
//4)使用Iterator遍历值所在的Collection集合
        Iterator it = values.iterator();
//5)获取每个值
        while ((it.hasNext())) {
            Object value = it.next();
//6)打印HashMap中的值,即Collection集合中的元素
            System.out.println(value);
        }
    }
}