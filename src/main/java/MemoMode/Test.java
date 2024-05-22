package MemoMode;

import MemoMode.caretaker.History;
import MemoMode.memento.EditorMemento;
import MemoMode.originator.Editor;

/**
 * @author JanYork
 * @date 2023/5/22 12:51
 * @description 测试案例
 */
public class Test {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.write("Hello, ");
        editor.write("world!");
        System.out.println("Current content: " + editor.getContent());

        // Save state
        history.push(editor.save());

        editor.write(" Have a nice day!");
        System.out.println("Modified content: " + editor.getContent());

        // Restore state
        EditorMemento memento = history.pop();
        if (memento != null) {
            editor.restore(memento);
        }

        System.out.println("Restored content: " + editor.getContent());
    }
}
