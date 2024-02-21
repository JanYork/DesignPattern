package AdapterMode.service;

/**
 * 模拟SQLite数据库的操作类，作为被适配者。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-21
 * @since 1.0.0
 */
public class SQLiteDatabase {
    public void connect() {
        System.out.println("连接到SQLite数据库。");
    }

    public void disconnect() {
        System.out.println("断开与 SQLite 数据库的连接。");
    }

    public void execute(String sql) {
        System.out.println("执行 SQLite 命令：" + sql);
    }
}
