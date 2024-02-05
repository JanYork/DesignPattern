package SOLID.LSP;

/**
 * 正方形类，继承自Shape类
 *
 * @author JanYork
 * @version 1.0.0
 * @date 2024-02-05
 * @since 1.0.0
 */
class Square extends Shape {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
