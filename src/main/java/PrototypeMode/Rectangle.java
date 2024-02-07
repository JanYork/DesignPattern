package PrototypeMode;

class Rectangle extends Shape {
    public Rectangle() {
        type = "矩形";
    }

    @Override
    void draw() {
        System.out.println("画一个矩形");
    }
}
