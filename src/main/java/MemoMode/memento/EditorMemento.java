package MemoMode.memento;

/**
 * @author JanYork
 * @date 2023/5/22 12:51
 * @description 编辑器备忘录
 */
public class EditorMemento {
    /**
     * 编辑器内容
     */
    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
