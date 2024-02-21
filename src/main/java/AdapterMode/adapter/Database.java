package AdapterMode.adapter;

/**
 * 目标接口定义了与数据库交互所需的基本操作
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-21
 * @since 1.0.0
 */
public interface Database {
    /**
     * 连接到数据库
     */
    void connect();

    /**
     * 断开与数据库的连接
     */
    void disconnect();

    /**
     * 执行SQL语句
     *
     * @param sql 要执行的SQL语句
     */
    void executeSQL(String sql);
}
