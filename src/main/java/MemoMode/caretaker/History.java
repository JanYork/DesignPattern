package MemoMode.caretaker;

import MemoMode.memento.EditorMemento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JanYork
 * @date 2023/5/22 12:51
 * @description 编辑器
 */
public class History {
    /**
     * 编辑器备忘录列表
     */
    private final List<EditorMemento> states = new ArrayList<>();

    /**
     * 保存
     * @param state 放入备忘录
     */
    public void push(EditorMemento state) {
        states.add(state);
    }

    /**
     * 恢复
     * @return 恢复备忘录
     */
    public EditorMemento pop() {
        if (!states.isEmpty()) {
            int lastIndex = states.size() - 1;
            EditorMemento state = states.get(lastIndex);
            states.remove(lastIndex);
            return state;
        }
        return null;
    }
}
