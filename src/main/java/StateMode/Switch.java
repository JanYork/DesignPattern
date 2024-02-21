package StateMode;

import StateMode.state.OffState;
import StateMode.state.State;

/**
 * 灯泡的开关类
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-21
 * @since 1.0.0
 */
public class Switch {
    /**
     * 状态对象
     */
    private State state;

    public Switch() {
        // 默认为关状态
        state = new OffState();
    }

    public Switch(State state) {
        // 传入状态对象
        this.state = state;
    }

    /**
     * 设置状态方法
     *
     * @param state 状态对象
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * 切换状态方法，调用状态对象的切换方法
     */
    public void toggle() {
        state.toggle(this);
    }

    /**
     * 获取状态方法
     *
     * @return {@link State}
     */
    public State getState() {
        return state;
    }
}
