package StrategyMode.StrategyAndFactory.factory;

import StrategyMode.StrategyAndFactory.strategy.ConsoleLogStrategy;
import StrategyMode.StrategyAndFactory.LogStrategy;
import StrategyMode.StrategyAndFactory.strategy.FileLogStrategy;

/**
 * 策略工厂，根据类型创建对应的日志策略
 * <p>
 * 其实可以进一步优化，将对象丢入一个缓存对象容器中，这样可以避免每次都去构建策略对象
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class LogStrategyFactory {
    /**
     * 工厂方法，根据类型创建对应的日志策略
     * <p>
     * 本质上，设计模式不是解决IF过多的问题，而是进行拆解、隐藏、规范化，只是代码换了个地方。
     *
     * @param type 类型，也可以改为枚举更加规范
     * @return {@link LogStrategy} 策略
     */
    public static LogStrategy getLogStrategy(String type) {
        switch (type) {
            case "console":
                return new ConsoleLogStrategy();
            case "file":
                return new FileLogStrategy();
            default:
                throw new IllegalArgumentException("Unknown log strategy type");
        }
    }
}
