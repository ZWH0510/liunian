package work.D010911;
import java.util.*;
//Map实验3—HashMap集合第2种遍历方式
public class My_03 {
    public static void main(String[] args) {
//1)创建一个HashMap集合，使用空参的HashMap集合来实例化对象，需要导入java.util包
        Map map3 = new HashMap();
//2)通过put()方法向集合中加入三个元素：班级中任意3个学生的学号(key)和姓名(value)
        map3.put(01, "玛卡·巴卡");
        map3.put(02, "唔西·迪西");
        map3.put(03, "依古·比古");
//3)获取HashMap集合中所有的映射关系(Entry对象)，存入Set集合中
        Set<Map.Entry<Integer, String>> set = map3.entrySet();
//4)使用Iterator遍历映射关系所在的Set集合
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
//5)通过遍历获取每一个Entry对象
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
//6)获取Entry中的键
            Integer key = entry.getKey();
//7)获取Entry中的值
            String value = entry.getValue();
//8)打印HashMap中的元素(键和值),即通过Entry对象获得的键和值
            System.out.println(key + "...." + value);
        }
    }
}