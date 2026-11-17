package d01_myjdbc;

// Mysql 实现 JDBC 的标准接口
public class MysqlJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("获取 mysql 连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("执行 mysql 增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭 mysql 连接");
    }
}
