package d02_introduction.manula;

import java.sql.*;

public class JdbcClassicDemo {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            String url = "jdbc:mysql://localhost:3306/lrn_jdbc?serverTimezone=UTC";
            conn = DriverManager.getConnection(url, "root", "123456");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM t_user WHERE balance >200.00 ORDER BY id ASC;");

            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                double balance = rs.getDouble("balance");
                System.out.println(id + " - " + username + " - " + balance);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
