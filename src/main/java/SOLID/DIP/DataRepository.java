package SOLID.DIP;

/**
 * 数据存储抽象
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public interface DataRepository {
    void saveReport(String report);
}
