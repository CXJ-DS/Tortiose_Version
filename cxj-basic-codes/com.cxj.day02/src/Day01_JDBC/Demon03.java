package Day01_JDBC;

import domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Demon03 {
    public static void main(String[] args) {
        List<User> list = new Demon03().FindAll();
        System.out.println(list);
    }

    /**
     *
     * @return 返回list集合对象
     */
    public List<User> FindAll(){
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        List<User> List = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_user", "root", "123456");
            String sql = "select * from user";
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            User user = null;
            List = new ArrayList<User>();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                user = new User();
                user.setId(id);
                user.setName(name);
                user.setPassword(password);
                List.add(user);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stat !=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return List;
    }
}
