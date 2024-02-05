package StrategyMode.SimpleStrategy;

/**
 * 日志输出策略接口
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public interface LogStrategy {
    /**
     * 日志策略方法
     * <p>
     * 策略接口定义了所有具体策略必须实现的方法，此处限制子类必须提供名为log的方法，并且只接收一个String类型的message参数
     *
     * @param message 日志内容
     */
    void log(String message);
}
