package StateMode.state;

import StateMode.Switch;

/**
 * 开灯状态
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-21
 * @since 1.0.0
 */
public class OnState implements State {
    /**
     * 切换状态
     *
     * @param sw 开关对象
     */
    public void toggle(Switch sw) {
        System.out.println("关闭");
        // 传入关闭状态到开关类的设置状态方法
        sw.setState(new OffState());
    }
}
