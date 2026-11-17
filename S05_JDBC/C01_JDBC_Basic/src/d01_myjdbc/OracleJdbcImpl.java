package d01_myjdbc;

public class OracleJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("获取 oracle 连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("执行 oracle 增删改查");

    }

    @Override
    public void close() {
        System.out.println("关闭 oracle 连接");

    }
}
