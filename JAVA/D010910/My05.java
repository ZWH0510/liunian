package work.D010910;
//实验5 LinkedList类（参考课本案例9-3）
//1.包:ss;类:My05
import java.util.*;
public class My05 {
    //3.定义main方法
    public static void main(String[] args) {
        //(1)创建5个NewsTitle对象,需要导入java.util包
        NewsTitle NewsTitle1 = new NewsTitle(1, "A", "a");
        NewsTitle NewsTitle2 = new NewsTitle(2, "B", "b");
        NewsTitle NewsTitle3 = new NewsTitle(3, "C", "c");
        NewsTitle NewsTitle4 = new NewsTitle(4, "D", "d");
        NewsTitle NewsTitle5 = new NewsTitle(5, "E", "e");
        //(2)创建一个LinkedList集合对象list，并把（1）中前3个NewsTitle对象添加到list中。并输出list集合的长度。
        LinkedList list = new LinkedList();
        list.add(NewsTitle1);
        list.add(NewsTitle2);
        list.add(NewsTitle3);
        System.out.println("把（1）中前3个NewsTitle对象添加到list中。并输出list集合的长度:" + list.size());
        //(3)把（1）中后2个NewsTitle对象分别添加到list中开头和末尾。并输出此时list集合的长度。
        list.addFirst(NewsTitle4);
        list.addFirst(NewsTitle5);
        System.out.println("把（1）中后2个NewsTitle对象分别添加到list中开头和末尾。并输出此时list集合的长度:" + list.size());
        //(4)获得并输出list中第一个和最后一个元素。
        NewsTitle first = (NewsTitle) list.getFirst();
        NewsTitle last = (NewsTitle) list.getLast();
        System.out.println(first.getTitleName());
        System.out.println(last.getTitleName());
        //(5)利用for循环通过下标索引遍历集合list中的元素。
        for (int i = 0; i < list.size(); i++) {
            NewsTitle title = (NewsTitle) list.get(i);
            System.out.println(title.getId() + " " + title.getTitleName() + " " + title.getAuthor());
        }
        System.out.println("-----------");
        //(6)删除list中第一个和最后一个元素。再次利用for循环通过下标索引遍历集合list中的元素。
        list.removeFirst();
        list.removeLast();
        for (int i = 0; i < list.size(); i++) {
            NewsTitle title = (NewsTitle) list.get(i);
            System.out.println(title.getId() + " " + title.getTitleName() + " " + title.getAuthor());
        }
    }
}


//2.定义NewsTitle实体类
class NewsTitle1 {
    //(1)声明字段:int类型的学号id
    int id;
    //(2)声明字段:String类型的姓名titleName
    String titleName;
    //(3)声明字段:String类型的姓名author
    String author;

    //(4)构建全参构造方法
    public NewsTitle1(int id, String titleName, String author) {
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

}



