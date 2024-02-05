package SOLID.OCP.impl;

import SOLID.OCP.Shape;

/**
 * 实现Shape(图形)接口的Circle(圆形)类
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
public class Circle implements Shape {
    public void draw() {
        // 绘制圆形的逻辑
        System.out.println("Drawing a circle");
    }
}
