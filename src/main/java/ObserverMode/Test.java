package ObserverMode;

import ObserverMode.observer.Employee;
import ObserverMode.observer.SecurityTeam;
import ObserverMode.subject.AlertSystem;

/**
 * 观察者模式测试类
 * <p>
 * 在Spring中，事件处理机制允许应用程序在某些组件（比如服务或控制器）之间异步地传递状态变化或事件通知。
 * <ul>
 * <li>事件（Event）：这是要被传递的消息或状态变化的抽象表示。在Spring中，所有事件都必须扩展自ApplicationEvent类。</li>
 * <li>发布者（Publisher）：这是事件的发起者，它产生事件并发布它们。在Spring框架中，任何一个Bean都可以发布事件，通常使用ApplicationEventPublisher接口来发布。</li>
 * <li>
 *     监听器（Listener）：这相当于观察者模式中的观察者。监听器等待特定类型的事件发生，并定义了如何响应这些事件。
 *     在Spring中，事件监听器可以通过实现ApplicationListener接口或使用@EventListener注解来创建。
 * </li>
 * </ul>
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-17
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 构建警报系统(Subject)
        AlertSystem alertSystem = new AlertSystem();

        // 创建观察者(Observer) - 员工
        Employee alice = new Employee("张三");
        Employee bob = new Employee("李四");

        // 创建观察者(Observer) - 安全团队
        SecurityTeam securityTeam = new SecurityTeam();

        // 注册观察者
        alertSystem.attach(alice);
        alertSystem.attach(bob);
        alertSystem.attach(securityTeam);

        // 发出警告
        alertSystem.notifyObservers("大楼里着火了！");
    }
}
