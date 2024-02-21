package StateMode;

import StateMode.state.OnState;

/**
 * 测试状态模式
 * <p>
 * 状态模式允许一个对象在其内部状态改变时改变它的行为，对象会看起来似乎修改了它的类。
 * 这种模式主要是用来避免在代码中使用大量的条件判断语句。它通过将状态封装成独立的类，
 * 并将任务委托给代表当前状态的对象，来实现在运行时刻改变行为。
 *
 * 状态模式(State Pattern)主要适用于以下场景：
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-21
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Switch lightSwitch = new Switch();
        lightSwitch.toggle(); // 切换
        System.out.println("当前状态：" + lightSwitch.getState());
        lightSwitch.toggle(); // 切换
        System.out.println("当前状态：" + lightSwitch.getState());

        /* -------------------------------- */

        // 不使用默认状态
        OnState onState = new OnState();
        Switch onSwitch = new Switch(onState);
        System.out.println("当前状态：" + lightSwitch.getState());

        onSwitch.toggle(); // 切换
        System.out.println("当前状态：" + lightSwitch.getState());
    }
}
