package StrategyMode.StrategyAndFactory;

/**
 * 策略模式上下文，即动态的注入策略对象(通过构造器注入策略对象，也可以通过setter方法注入)，使用策略对象来执行具体的策略方法
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class Logger {
    /**
     * 策略对象抽象接口，此处也是多态的体现，
     * <p>
     * LogStrategy是一个接口，而Logger的构造器参数是LogStrategy的任意子类对象，
     */
    private LogStrategy logStrategy;

    /**
     * 构造器注入策略对象(任意LogStrategy子类对象)
     *
     * @param logStrategy 策略对象
     */
    public Logger(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }

    /**
     * 执行具体的策略方法
     *
     * @param message 日志消息
     */
    public void log(String message) {
        // 使用策略接口的方法，因为子类依赖于LogStrategy抽象必须实现log()方法，所以此处直接调用log()。
        logStrategy.log(message);
    }

    /**
     * 提供setter方法，方便在运行时动态注入策略对象
     *
     * @param logStrategy 策略对象
     */
    public void setLogStrategy(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }
}
