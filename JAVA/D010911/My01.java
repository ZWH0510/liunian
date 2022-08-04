package work.D010911;
//    实验1 HashMap集合的用法
import java.util.*;

public class My01 {
    public static void main(String[] args) {
//(1)创建一个HashMap集合,需要导入java.util包
        Map map1 = new HashMap();
//(2)通过put()方法向集合中加入四个元素:前三个元素为班级中任意3个学生的学号(key)和姓名(value);第四个元素的学号跟第三个元素的学号一致,姓名任意
        map1.put(01, "玛卡·巴卡");
        map1.put(02, "唔西·迪西");
        map1.put(03, "依古·比古");
        map1.put(03, "汤姆布利柏");
//(3)打印根据第一个元素的键获取的值
        System.out.println("第一个元素的键获取的值:" + map1.get(01));
//(4)打印根据第二个元素的键获取的值
        System.out.println("第二个元素的键获取的值:" + map1.get(02));
//(5)打印根据第三(或四)个元素的键获取的值
        System.out.println("第三个元素的键获取的值:" + map1.get(03));
    }
}