package ObserverMode.observer;

/**
 * 安全团队，作为观察者接收警报系统的通知。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-17
 * @since 1.0.0
 */
public class SecurityTeam implements MessageObserver {
    @Override
    public void notify(String message) {
        System.out.println("安全团队 收到警报: " + message);
    }
}
