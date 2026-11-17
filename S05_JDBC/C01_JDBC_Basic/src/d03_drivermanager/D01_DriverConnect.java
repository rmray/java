package d03_drivermanager;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class D01_DriverConnect {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/lrn_jdbc?serverTimezone=UTC";

        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password", "123456");

        Driver driver = new Driver();
        try (Connection connect = driver.connect(url, properties)) {
            System.out.println("直接通过 Driver 获取连接: " + connect);
        }
    }
}
