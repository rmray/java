package d02_introduction.automatic;

import java.sql.*;

public class JdbcAutoCloseDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/lrn_jdbc?serverTimezone=UTC";

        try (Connection connection = DriverManager.getConnection(url, "root", "123456");
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM t_user WHERE balance >200.00 ORDER BY id ASC;");
        ) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                double balance = rs.getDouble("balance");
                System.out.println(id + " = " + username + " = " + balance);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
