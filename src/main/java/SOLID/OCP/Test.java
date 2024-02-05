package SOLID.OCP;

import SOLID.OCP.impl.Circle;
import SOLID.OCP.impl.Rectangle;
import SOLID.OCP.impl.Triangle;

/**
 * 在这个例子中，如果需要添加更多的形状类型，GraphicEditor(画图程序)类不需要任何修改。
 * 我们只需添加新的形状类，并实现Shape接口。
 * <p>
 * 这就是开闭原则的体现：对扩展开放（添加新的形状），对修改封闭（不需要改变GraphicEditor类）。
 * <p>
 * 假设目前还没有Triangle图形类，现在需要添加Triangle图形类，我们只需新增一个Triangle类，并实现Shape接口即可，然后使用时候将Triangle对象注入GraphicEditor中即可。
 * <p>
 * 如果我们直接将逻辑写在GraphicEditor类中，那么当需要添加新的图形类时，就需要修改GraphicEditor类，需要改动代码并重构，这违背了开闭原则。
 * 而开闭原则的体现就是，原来的类与代码尽量的不去修改，而是通过扩展新的代码(类)文件的方式来实现新的功能。
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        editor.drawShape(circle);
        editor.drawShape(rectangle);


        // 假设需要新的图形Triangle，我们只需新增一个Triangle类，并实现Shape接口即可
        Shape triangle = new Triangle();
        // 然后注入图形类，这样不需要动GraphicEditor类的任何代码
        editor.drawShape(triangle);
    }
}
