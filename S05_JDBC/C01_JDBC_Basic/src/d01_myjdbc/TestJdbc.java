package d01_myjdbc;

public class TestJdbc {
    public static void main(String[] args) {
        // 1. msyql
        MysqlJdbcImpl mysqlJdbc = new MysqlJdbcImpl();
        mysqlJdbc.getConnection();
        mysqlJdbc.crud();
        mysqlJdbc.close();

        // 2. oracle
        OracleJdbcImpl oracleJdbc = new OracleJdbcImpl();
        oracleJdbc.getConnection();
        oracleJdbc.crud();
        oracleJdbc.close();
    }
}
