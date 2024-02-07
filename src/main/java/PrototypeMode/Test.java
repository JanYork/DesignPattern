package PrototypeMode;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        rectangle.draw();
        circle.draw();

        /* --------------------------------- */

        System.out.println("以下为原型模式测试");

        //  克隆对象
        Rectangle clonedRectangle = (Rectangle) rectangle.clone();
        clonedRectangle.draw();

        // 克隆对象
        Circle clonedCircle = (Circle) circle.clone();
        clonedCircle.draw();
    }
}
