package ObserverMode.observer;

/**
 * 观察者接口
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-17
 * @since 1.0.0
 */
public interface MessageObserver {
    /**
     * 通知方法
     *
     * @param message 通知内容
     */
    void notify(String message);
}
