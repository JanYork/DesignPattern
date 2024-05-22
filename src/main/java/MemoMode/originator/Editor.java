package MemoMode.originator;

import MemoMode.memento.EditorMemento;

/**
 * @author JanYork
 * @date 2023/5/22 12:51
 * @description 编辑器
 */
public class Editor {
    /**
     * 编辑器内容
     */
    private String content;

    /**
     * 写入文本
     * @param text 文本
     */
    public void write(String text) {
        content += text;
    }

    /**
     * 保存
     * @return 编辑器备忘录
     */
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    /**
     * 恢复
     * @param memento 编辑器备忘录
     */
    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }

    public String getContent() {
        return content;
    }
}
