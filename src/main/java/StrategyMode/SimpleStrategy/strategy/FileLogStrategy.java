package StrategyMode.SimpleStrategy.strategy;

import StrategyMode.SimpleStrategy.LogStrategy;

/**
 * 日志写入文件策略，实现LogStrategy接口
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class FileLogStrategy implements LogStrategy {
    /**
     * 实现日志记录的逻辑
     *
     * @param message 日志内容
     */
    @Override
    public void log(String message) {
        // 文件日志策略的实现
        // 这里为了简化示例，我们只是打印一条消息
        System.out.println("Log to file: " + message);
        // 实际中，这里应该包含将消息写入文件的代码
    }
}
