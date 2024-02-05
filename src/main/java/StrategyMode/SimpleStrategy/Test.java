package StrategyMode.SimpleStrategy;

import StrategyMode.SimpleStrategy.strategy.ConsoleLogStrategy;
import StrategyMode.SimpleStrategy.strategy.FileLogStrategy;

/**
 * 简单策略模式测试类
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 构造器注入一个日志控制台写入策略
        Logger logger = new Logger(new ConsoleLogStrategy());
        logger.log("This is a log message."); // 结果：Log to console: This is a log message.

        // 在运行时切换为日志文件写入策略
        logger.setLogStrategy(new FileLogStrategy());
        logger.log("This is a log message."); //  结果：Log to file: This is a log message.
    }
}
