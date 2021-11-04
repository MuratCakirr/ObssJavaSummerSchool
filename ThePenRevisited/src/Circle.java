public class Circle extends Shape {
    private int radius;

    public Circle(int radius,String color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public int getArea() {
        return (3*(radius*radius));
    }
}
