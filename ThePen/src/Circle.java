public class Circle {
    private int radius;
    private String color;
    private int area;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int calculateCircleArea(){
        area = 3*(radius*radius);
        return area;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
