package work.D010912;

import java.util.*;

public class T03 {
    private static List<String> list = new ArrayList<String>();
    public static void main(String[] args) {
        init();			//调用init()为list集合对象准备测试数据
        testSort();		//调用testSort()--排序操作
        testSearch();	//调用testSearch()--查找替换操作
    }

    // 为list集合对象准备测试数据
    private static void init() {
        list.add("Rose");
        list.add("Even");
        list.add("Amy");
        list.add("Jack");
        list.add("Even");
        list.add("Alice");
    }

    // testSort()--排序操作
    public static void testSort() {
        System.out.println("原始顺序：" + list);
        Collections.reverse(list);
        System.out.println("reverse()反转后顺序：" + list);
        Collections.shuffle(list);
        System.out.println("shuffle()重新洗牌后顺序：" + list);
        Collections.swap(list, 1, 3);
        System.out.println("swap()1和3处交换后顺序：" + list);
        Collections.sort(list);
        System.out.println("sort()排序后顺序：" + list);
        Collections.rotate(list, 2);
        System.out.println("rotate()循环右移两个后顺序：" + list);
    }

    // testSearch()--查找替换操作
    public static void testSearch() {
        System.out.println("\n目前给定的list：" + list);
        System.out.println("最大值max()：" + Collections.max(list));
        System.out.println("最小值min()：" + Collections.min(list));
        System.out.println("Even在集合中出现的次数：" + Collections.frequency(list, "Even"));
        Collections.replaceAll(list, "Even", "Eve");
        System.out.println("Even被替换成Eve之后：" + list);
        // 如果binarySearch的对象没有排序的话，搜索结果是不确定的
        System.out.println("Jack的位置(排序前)：" + Collections.binarySearch(list, "Jack") + list);	// 由于没有排序，返回值为一个随机数
        Collections.sort(list);
        System.out.println("Jack的位置(排序后)：" + Collections.binarySearch(list, "Jack") + list);    // sort之后，正确结果结果出来了
        Collections.fill(list, "A");
        System.out.println("将list集合中元素全部替换为A：" + list);
    }
}
