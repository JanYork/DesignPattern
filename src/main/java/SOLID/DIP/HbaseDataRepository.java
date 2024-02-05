package SOLID.DIP;

/**
 * Hbase数据存储实现
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class HbaseDataRepository implements DataRepository {
    public void saveReport(String report) {
        // 使用SQL数据库保存报告
        System.out.println("保存报告到Hbase数据库: " + report);
    }
}
