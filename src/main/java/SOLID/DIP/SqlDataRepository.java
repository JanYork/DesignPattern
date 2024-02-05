package SOLID.DIP;

/**
 * SQL数据存储实现
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class SqlDataRepository implements DataRepository {
    public void saveReport(String report) {
        // 使用SQL数据库保存报告
        System.out.println("保存报告到SQL数据库: " + report);
    }
}
