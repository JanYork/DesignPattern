package StateMode.state;

import StateMode.Switch;

/**
 * 灯泡状态抽象接口
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-21
 * @since 1.0.0
 */
public interface State {
    /**
     * 切换状态
     *
     * @param sw 开关
     */
    void toggle(Switch sw);
}
