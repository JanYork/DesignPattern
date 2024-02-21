package AdapterMode;

import AdapterMode.adapter.Database;
import AdapterMode.adapter.MySQLAdapter;
import AdapterMode.adapter.SQLiteAdapter;
import AdapterMode.service.MySQLDatabase;
import AdapterMode.service.SQLiteDatabase;

/**
 * 客户端代码通过Database接口与不同的数据库进行交互。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-21
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 使用MySQL数据库
        MySQLDatabase mySQLDatabase = new MySQLDatabase();
        Database mySQL = new MySQLAdapter(mySQLDatabase);
        mySQL.connect();
        mySQL.executeSQL("SELECT * FROM users");
        mySQL.disconnect();

        /* ------------------------------------------------ */

        // 使用SQLite数据库
        SQLiteDatabase sqliteDatabase = new SQLiteDatabase();
        Database sqlite = new SQLiteAdapter(sqliteDatabase);
        sqlite.connect();
        sqlite.executeSQL("SELECT * FROM users");
        sqlite.disconnect();
    }
}
