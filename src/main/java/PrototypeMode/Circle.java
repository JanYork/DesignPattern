package PrototypeMode;

/**
 * 圆形类
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-07
 * @since 1.0.0
 */
class Circle extends Shape {
    public Circle() {
        type = "圆形";
    }

    @Override
    void draw() {
        System.out.println("画一个圆形");
    }
}

