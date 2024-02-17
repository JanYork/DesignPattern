package ObserverMode.observer;

/**
 * 办公室员工，作为观察者接收警报系统的通知。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-17
 * @since 1.0.0
 */
public class Employee implements MessageObserver {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println(name + " 收到警报消息: " + message);
    }
}
