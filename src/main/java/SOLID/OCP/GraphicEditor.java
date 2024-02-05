package SOLID.OCP;

/**
 * 图形编辑器，即画图程序，该程序可以根据输入的参数来画不同形状
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class GraphicEditor {
    /**
     * 根据不同形状，画出不同图形
     *
     * @param shape the shape
     */
    public void drawShape(Shape shape) {
        shape.draw();
    }
}
