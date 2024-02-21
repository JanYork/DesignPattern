package AdapterMode.service;

/**
 * 模拟MySQL数据库的操作，作为一个被适配者
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-21
 * @since 1.0.0
 */
public class MySQLDatabase {
    public void openConnection() {
        System.out.println("打开 MySQL 数据库连接。");
    }

    public void closeConnection() {
        System.out.println("关闭 MySQL 数据库连接。");
    }

    public void runQuery(String sql) {
        System.out.println("运行 MySQL 查询：" + sql);
    }
}
