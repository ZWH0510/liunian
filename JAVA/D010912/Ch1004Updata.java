package work.D010912;

import java.sql.*;

public class Ch1004Updata {
    public static void main(String[] args) {
        Connection connection = null;// 创建Connection对象
        PreparedStatement preparedStatement = null;// 创建PreparedStatement对象
        try {
            Class.forName("com.mysql.jdbc.Driver");// 加载MySQL数据库驱动
            System.out.println("数据库驱动加载完毕!");// 打印"数据库驱动加载完成!"
            String url = "jdbc:mysql://localhost:3306/mysql";// 数据库的连接地址
            String username = "root";// 登录数据库的用户名
            String password = "root";// 登录数据库的密码
            connection = DriverManager.getConnection(url, username, password);// 创建与数据库的连接
            System.out.println("连接数据库成功!");// 打印"连接数据库成功!"
            String sql = "update student set name='liyiru' where name='liruyi'";// 创建修改数据的SQL语句
            preparedStatement = connection.prepareStatement(sql);// 获取preparedStatement对象
            preparedStatement.executeUpdate();// 执行SQL语句
            System.out.println("数据修改成功!");// 打印"数据修改成功!"
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("数据库驱动加载失败!");// 打印"数据库驱动加载失败!"
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接数据库/数据修改失败!");// 打印"连接数据库/数据修改失败!"
        } finally {// 释放资源,关闭数据库连接
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
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
