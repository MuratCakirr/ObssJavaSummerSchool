public class Pen {

    public void drawRectangle(Rectangle r){
        System.out.println("Area of rectangle: " + r.calculateRectangleArea());
    }

    public void drawCircle(Circle c){
        System.out.println("Area of circle: " + c.calculateCircleArea());
    }

    public void changeColorRectangle(String color,Rectangle r){
        r.setColor(color);
        System.out.println("Color of rectangle: " + r.getColor());
    }

    public void changeColorCircle(String color,Circle c){
        c.setColor(color);
        System.out.println("Color of circle: " + c.getColor());
    }
}
