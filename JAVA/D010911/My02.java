package work.D010911;
//    实验2 遍历Map集合—键值遍历
import java.util.*;
public class My02 {
    public static void main(String[] args) {
//(1)创建一个HashMap集合,需要导入java.util包
        Map map2 = new HashMap();
//(2)通过put()方法向集合中加入三个元素:班级中任意3个学生的学号(key)和姓名(value)
        map2.put(01, "玛卡·巴卡");
        map2.put(02, "唔西·迪西");
        map2.put(03, "依古·比古");
//(3)获取集合中所有的键,存入Set集合中
        Set<Map.Entry<Integer, String>> set = map2.entrySet();
//(4)使用Iterator遍历键所在的Set集合
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
//(5)获取每个键所对应的值
            Integer key = entry.getKey();
            String value = entry.getValue();
//(6)打印HashMap中的元素(键和值)
            System.out.println(key + "...." + value);
        }
    }
}