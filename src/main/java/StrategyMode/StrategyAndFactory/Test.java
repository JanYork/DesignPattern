package StrategyMode.StrategyAndFactory;

import StrategyMode.StrategyAndFactory.factory.LogStrategyFactory;

/**
 * 工厂+策略模式测试类
 * <p>
 * 有人可能疑惑，为什么需要加一个工厂，直接new不好吗？其实对于只有少数几个简单对象确实直接new更加方便，
 * 如果对象非常多，又或者策略对象改动频繁，或者构建较为复杂，那么使用工厂模式是最好的选择，可以隐藏复杂构建过程并与实际业务逻辑解耦。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Logger logger = new Logger(LogStrategyFactory.getLogStrategy("console"));
        logger.log("Logging with console strategy.");

        // 使用工厂切换策略
        logger.setLogStrategy(LogStrategyFactory.getLogStrategy("file"));
        logger.log("Logging with file strategy.");
    }
}
