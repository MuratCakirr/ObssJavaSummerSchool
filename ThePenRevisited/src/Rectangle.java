public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height,String color) {
        this.width = width;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public int getArea() {
        return width*height;
    }
}
