package d01_myjdbc;

// JDBC 标准接口
public interface JdbcInterface {
    public Object getConnection();

    public void crud();

    public void close();
}
