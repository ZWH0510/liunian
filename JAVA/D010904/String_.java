package work.D010904;
public class String_ {
    public static void main(String[] args) {
        String str = "abcdabcdabcdabcd";
        int count = 0;
        do {
            //获得“a”在str中出现的索引
            int index = str.indexOf("a");
            if (index != -1) {
                count++;
                str = str.substring(index + 2);
            } else
                break; // index�?1说明已经统计完毕
        } while (str.length() >= 2);
        System.out.print("a出现了：" + count + "�?);
    }
}



//        实验2 记录一个子串在整串中出现的次数
//        编写一个程序，记录一个子串在整串中出现的次数�?
//        例如记录子串"nba"在整�?nbaernbatnbaynbauinbaopnba"中出现的次数
//        通过观察可知子串"nba"出现的次数为6
//        要求使用String类的常用方法来计算出现的次数�?
//        1.分析任务描述可知，做此任务需要先定义两个字符串，一个表示子串，一个表示整�?
//        2.要查找子串在整串中出现的次数，可以先使用Sting类的contains()方法�?
//        判断整串中是否包含子串，如果不包含，那么不用计算，子串在整串中出现的次数一定为0
//        3.如果整串中包含了子串，那么再具体计算出现的次数。使用String类的indexOf()方法可以获取子串在整串中第一次出现的索引�?
//        获取到之后，再在整串中该索引加上子串长度的位置处继续查找子串（可以通过String类的substring()方法将整串的剩余部分截取出来�?
//        然后在剩余整串中从头查找子串)。依此类推，通过循环完成查找，直到找不到子串为止，此时indexOf()方法的返回值为-1
//        4.定义一个计数器，记录出现的次数，在循环中每查到一次子串，则计数器�?
