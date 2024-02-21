package AdapterMode.adapter;

import AdapterMode.service.MySQLDatabase;

/**
 * MySQL适配器
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-21
 * @since 1.0.0
 */
public class MySQLAdapter implements Database {
    private final MySQLDatabase mySQL;

    /**
     * 构造方法，注入MySQL数据库实例
     *
     * @param mySQL the MySQL database
     */
    public MySQLAdapter(MySQLDatabase mySQL) {
        this.mySQL = mySQL;
    }

    @Override
    public void connect() {
        mySQL.openConnection();
    }

    @Override
    public void disconnect() {
        mySQL.closeConnection();
    }

    @Override
    public void executeSQL(String sql) {
        mySQL.runQuery(sql);
    }
}
