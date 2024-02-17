package ObserverMode.subject;

import ObserverMode.observer.MessageObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 警报系统，充当观察者模式中的主题（Subject）。
 * <p>
 * 它维护一个观察者列表，并在状态发生变化时（如接收到安全警告）通知所有观察者。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-17
 * @since 1.0.0
 */
public class AlertSystem {
    /**
     * 观察者列表
     */
    private final List<MessageObserver> observers = new ArrayList<>();

    /**
     * 注册观察者。
     *
     * @param observer 要注册的观察者。
     */
    public void attach(MessageObserver observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者。
     *
     * @param observer 要移除的观察者。
     */
    public void detach(MessageObserver observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有注册的观察者。
     *
     * @param message 描述状态变化的消息。
     */
    public void notifyObservers(String message) {
        for (MessageObserver observer : observers) {
            observer.notify(message);
        }
    }
}

