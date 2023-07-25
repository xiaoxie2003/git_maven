package yc.xx.git_github;

import java.sql.*;

public class GetConnection {
    private Connection conn;//连接对象
    private PreparedStatement stmt;//预编译对象
    private ResultSet rs;//Jieguo集对象

    public Connection getConn() {
        try {
            conn = DriverManager.getConnection(MyProperties.getInstance().getProperty("url"),
                    MyProperties.getInstance());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
