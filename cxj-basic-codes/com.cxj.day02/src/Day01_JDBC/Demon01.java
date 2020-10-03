package Day01_JDBC;

/**
 * 加深对jdbc的连接各项，并熟练运用SQL语句ddl操作
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demon01 {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接数据库对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_user", "root", "123456");
            //创建sql语句
            // String sql = "update User set password ='cxj' where id = 1";
            // String sql = "insert into USER VALUES(null,'cxj','cxj')";
            String sql = "DELETE FROM USER WHERE NAME = 'cxj'";
            //获取执行sql的对象statement
            stat = conn.createStatement();
            //执行sql语句
            int count = stat.executeUpdate(sql);
            if(count > 0){
                System.out.println("更改成功!");
            }else{
                System.out.println("更新失败!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stat !=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn !=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
