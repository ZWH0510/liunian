package work.D010912;

import java.sql.*;

public class Ch1002CreateTable {
    public static void main(String[] args) {
        Connection connection = null;// 创建Connection对象
        Statement statement = null;// 创建Statement对象
        try {
            Class.forName("com.mysql.jdbc.Driver");// 加载MySQL数据库驱动
            System.out.println("数据库驱动加载完毕!");// 打印"数据库驱动加载完成!"
            String url = "jdbc:mysql://localhost:3306/mysql";// 数据库的连接地址
            String username = "root";// 登录数据库的用户名
            String password = "root";// 登录数据库的密码
            connection = DriverManager.getConnection(url, username, password);// 创建与数据库的连接
            System.out.println("连接数据库成功!");// 打印"连接数据库成功!"
            statement = connection.createStatement();// 获取Statement对象
            String sql = "create table student(id int,name varchar(20),sex varchar(3),tel varchar(11))";// 创建数据表的SQL语句
            statement.executeUpdate(sql);// 执行SQL语句
            System.out.println("数据表创建成功!");// 打印"数据表创建成功!"
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("数据库驱动加载失败!");// 打印"数据库驱动加载失败!"
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接数据库/创建数据表失败!");// 打印"连接数据库/创建数据表失败!"
        } finally {// 释放资源,关闭数据库连接
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
