package work.D010912;

import java.sql.*;

public class Ch1001Connection {
    public static void main(String[] args) {
        Connection connection = null;// 创建Connection对象
        try {
            Class.forName("com.mysql.jdbc.Driver");// 加载MySQL数据库驱动
            System.out.println("数据库驱动加载完毕!");// 打印"数据库驱动加载完成!"
            String url = "jdbc:mysql://localhost:3306/mysql";// 数据库的连接地址
            String username = "root";// 登录数据库的用户名
            String password = "root";// 登录数据库的密码
            connection = DriverManager.getConnection(url, username, password);// 创建与数据库的连接
            System.out.println("连接数据库成功!");// 打印"连接数据库成功!"

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("数据库驱动加载失败!");// 打印"数据库驱动加载失败!"

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接数据库失败!");// 打印"连接数据库失败!"

        } finally {//关闭数据库
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

