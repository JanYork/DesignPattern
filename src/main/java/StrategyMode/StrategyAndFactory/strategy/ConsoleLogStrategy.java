package StrategyMode.StrategyAndFactory.strategy;

import StrategyMode.StrategyAndFactory.LogStrategy;

/**
 * 打印日志到控制台策略，实现LogStrategy接口
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class ConsoleLogStrategy implements LogStrategy {
    /**
     * 重写log方法，实现控制台的日志输出
     *
     * @param message 日志内容
     */
    @Override
    public void log(String message) {
        // 控制台日志策略的实现
        System.out.println("Log to console: " + message);
    }
}
