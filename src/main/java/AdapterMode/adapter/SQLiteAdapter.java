package AdapterMode.adapter;

import AdapterMode.service.SQLiteDatabase;

/**
 * SQLite适配器
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-21
 * @since 1.0.0
 */
public class SQLiteAdapter implements Database {
    private final SQLiteDatabase sqlite;

    public SQLiteAdapter(SQLiteDatabase sqlite) {
        this.sqlite = sqlite;
    }

    @Override
    public void connect() {
        sqlite.connect();
    }

    @Override
    public void disconnect() {
        sqlite.disconnect();
    }

    @Override
    public void executeSQL(String sql) {
        sqlite.execute(sql);
    }
}
