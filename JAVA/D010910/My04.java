package work.D010910;
//实验4 重写hashCode()和equals()方法2

//1.包:ss;类:My04

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class My04 {
    //3.定义main方法
    public static void main(String[] args) {
//(1)创建一个HashSet集合set1,需要导入java.util包
        Set set1 = new HashSet();
//(2)将三个学生姓名添加到集合中
        set1.add("熊大");
        set1.add("熊二");
        set1.add("光头强");
//(3)打印该集合
        System.out.println("打印set1集合：" + set1);
//(1)再创建一个HashSet集合set2,需要导入java.util包
        Set set2 = new HashSet();
//(2)创建四个titleName对象并实例化。
        NewsTitle titleName1 = new NewsTitle(1, "AAA", "a");
        NewsTitle titleName2 = new NewsTitle(2, "BBB", "b");
        NewsTitle titleName3 = new NewsTitle(3, "CCC", "c");
        NewsTitle titleName4 = new NewsTitle(4, "DDD", "d");
//(3)将四个对象添加到集合中
        set2.add(titleName1);
        set2.add(titleName2);
        set2.add(titleName3);
        set2.add(titleName4);
//(4)使用迭代器对象遍历输出该集合
        System.out.println("使用迭代器对象遍历输出该集合:");
        Iterator i = set1.iterator();
        while (i.hasNext()) {
            String str1 = (String) i.next();
            System.out.println(str1);
        }
    }
}


//2.定义NewsTitle实体类
class NewsTitle {
    //(1)声明字段:int类型的学号id
    int id;
    //(2)声明字段:String类型的姓名titleName
    String titleName;
    //(3)声明字段:String类型的姓名author
    String author;
    //(4)构建全参构造方法
    public NewsTitle(int id, String titleName, String author) {
        this.id = id;
        this.titleName = titleName;
        this.author = author;
    }

//(5)构建getId()方法和setId()方法。

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    //(6)构建getTitleName()方法和setTitleName()方法。
    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    //(7)构建getAuthor()方法和setAuthor()方法。
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //(8)重写hashCode()方法:返回id属性的哈希值
//(9)重写equals()方法
//①判断要进行比较的对象是否为同一个对象,如果是,返回true
//②判断要进行比较的对象是否为titleName类型,如果不是,返回false
    //③将要进行比较的对象进行强制类型转换为titleName,判断两个对象的id是否相等,并将判断结果返回
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsTitle newsTitle = (NewsTitle) o;
        return id == newsTitle.id &&
                titleName.equals(newsTitle.titleName) &&
                author.equals(newsTitle.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titleName, author);
    }
}



